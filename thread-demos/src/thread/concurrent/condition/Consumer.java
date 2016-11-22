package thread.concurrent.condition;

import thread.wait.*;

public class Consumer implements Runnable {

    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    public void run() {
        System.out.println("Consumer is consuming ...");

        for (int i = 1; i <= 5; i++) {
            try {
                clerk.getProduct();
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
