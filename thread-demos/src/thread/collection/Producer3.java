package thread.collection;

import java.util.concurrent.BlockingQueue;

public class Producer3 implements Runnable {

    private BlockingQueue<Integer> productQueue;

    public Producer3(BlockingQueue<Integer> productQueue) {
        this.productQueue = productQueue;
    }

    public void run() {
        System.out.println("Producer3 begin producting...");

        for (int product = 1; product <= 4; product++) {
            try {
                productQueue.put(product);
                System.out.printf("Producer3 provide integer (%d) %n", product);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
