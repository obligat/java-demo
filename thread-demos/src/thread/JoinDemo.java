package thread;

import static java.lang.System.out;

public class JoinDemo {

    public static void main(String[] args) throws InterruptedException {
        out.println("Main thread is beginning ...");

        Thread threadB = new Thread(() -> {
            out.println("ThreadB is beginning ...");
            for (int i = 0; i < 5; i++) {
                out.println("ThreadB is executing ...");
            }

            out.println("ThreadB will finish.");
        });

        threadB.start();
        threadB.join();

        out.println("Main thread will finish.");
    }
}
