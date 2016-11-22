package thread.concurrent;

import java.util.concurrent.locks.*;

class Resource {

    private ReentrantLock lock = new ReentrantLock();
    private String name;

    Resource(String name) {
        this.name = name;
    }

    void cooperate(Resource res) {
        while (true) {
            try {
                if (lockMeAnd(res)) {
                    System.out.printf(" %s cooperate %s resource %n", this.name, res.name);
                }
            } finally {
                unLockMeAnd(res);
            }
        }
    }

    private boolean lockMeAnd(Resource res) {
        return this.lock.tryLock() && res.lock.tryLock();
    }

    private void unLockMeAnd(Resource res) {
        if (this.lock.isHeldByCurrentThread()) {
            this.lock.unlock();
        }

        if (res.lock.isHeldByCurrentThread()) {
            res.lock.unlock();
        }
    }
}

public class NoDeadLockDemo {

    public static void main(String[] args) {

        Resource res1 = new Resource("res1");
        Resource res2 = new Resource("res2");

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                res1.cooperate(res2);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                res2.cooperate(res1);
            }
        });

        thread1.start();
        thread2.start();
    }
}



/*
 ...
 res1 cooperate res2 resource 
 res2 cooperate res1 resource 
 res2 cooperate res1 resource 
 res1 cooperate res2 resource 
 res1 cooperate res2 resource 
 res1 cooperate res2 resource 
 ...
*/