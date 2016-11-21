package thread;

public class InterruptedDemo {

    public static void main(String[] args) {

        Thread thread = new Thread() {

            @Override
            public void run() {

                try {

                    Thread.sleep(99999);
                } catch (InterruptedException ex) {

                    System.out.println("I am waked.");
                }
            }
        };

        thread.start();
        thread.interrupt();
    }
}


//run:
//I am waked.