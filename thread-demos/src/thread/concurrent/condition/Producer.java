package thread.concurrent.condition;

import thread.wait.*;

public class Producer implements Runnable {

    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    public void run() {
        System.out.println("Producer is producting ...");

        for (int product = 1; product <= 5; product++) {
            try {
                clerk.setProduct(product);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
