package thread;

public class ThreadGroupDemo {

    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("group") {
            @Override
            public void uncaughtException(Thread thread, Throwable throwable) {
                System.out.printf("%s: %s%n", thread.getName(), throwable.getMessage());
            }
        };

        Thread thread = new Thread(group, () -> {
            throw new RuntimeException("Test Exception");
        });

        thread.start();
    }
}


//run:
//Thread-0: Test Exception

// uncaughtException() 方法的第一个参数可取得发生异常的线程实例，第二个参数可取得异常对象。
// 运行结果显示了线程的名称及异常信息。