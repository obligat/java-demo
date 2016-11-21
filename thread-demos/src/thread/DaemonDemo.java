package thread;

public class DaemonDemo {

    public static void main(String[] args) {

        Thread thread = new Thread() {

            public void run() {

                while (true) {
                    System.out.println("Orz");
                }
            }
        };

//        如果没有设置 true ， 程序会一直输出 Orz 
        thread.setDaemon(true);
        thread.start();
    }
}
