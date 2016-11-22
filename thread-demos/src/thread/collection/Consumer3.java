package thread.collection;

import java.util.concurrent.BlockingQueue;

public class Consumer3 implements Runnable {

    private BlockingQueue<Integer> productQueue;

    public Consumer3(BlockingQueue<Integer> productQueue) {
        this.productQueue = productQueue;
    }

    public void run() {
        System.out.println("Consumer3 begin consuming Integer ...");

        for (int i = 1; i <= 4; i++) {
            try {
                int product = productQueue.take();
                System.out.printf("Consumer3 consuemed Integer (%d) %n", product);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
