package thread.concurrent.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Clerk2 {

    private int product = -1;
    private Lock lock = new ReentrantLock();
    
//    拥有生产者等待集合
    private Condition producerCond = lock.newCondition();
//    拥有消费者等待集合
    private Condition consumerCond = lock.newCondition();

    public void setProduct(int product) throws InterruptedException {
        lock.lock();
        try {
            waitIfFull();
            this.product = product;
            System.out.printf("Product set ( %d ) %n ", this.product);
            
//            通知消费者等待集合中的消费者线程
            consumerCond.signal();
        } finally {
            lock.unlock();
        }

    }

    private void waitIfFull() throws InterruptedException {
        while (this.product != -1) {
            
//            至生产者等待集合等待
            producerCond.await();
        }
    }

    public int getProduct() throws InterruptedException {
        lock.lock();
        try {
            waitIfEmpty();
            int p = this.product;
            this.product = -1;
            System.out.printf(" Consumer get ( %d ) %n", p);
            producerCond.signal();
            return p;
        } finally {
            lock.unlock();
        }
    }

    private void waitIfEmpty() throws InterruptedException {

        while (this.product == -1) {
            consumerCond.await();
        }
    }
}
