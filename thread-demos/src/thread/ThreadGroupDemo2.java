package thread;

public class ThreadGroupDemo2 {

    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("group");

        Thread thread1 = new Thread(group, () -> {
            throw new RuntimeException("thread1 test exception");
        });

        thread1.setUncaughtExceptionHandler((thread, throwable) -> {
            System.out.printf("%s: %s %n", thread.getName(), throwable.getMessage());
        });

        Thread thread2 = new Thread(group, () -> {
            throw new RuntimeException("thread2 test exception");
        });

        thread1.start();
        thread2.start();
    }
}


//run:
//Exception in thread "Thread-1" java.lang.RuntimeException: thread2 test exception
//Thread-0: thread1 test exception 
//	at thread.ThreadGroupDemo2.lambda$2(ThreadGroupDemo2.java:17)
//	at java.lang.Thread.run(Thread.java:745)

// 解析：
// 这个范例中，t1 t2 都属于同一个 ThreadGroup，t1 设定了 Thread.UncaughtExceptionHandler 实例，
// 所以未捕获的异常会以 Thread.UncaughtExceptionHandler 定义的方式处理， t2 未设定，且 t2 不是 
// ThreadDeath 的实例，所以默认调用异常的 printStrackTrace()。