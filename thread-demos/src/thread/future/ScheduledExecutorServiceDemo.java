package thread.future;

import java.util.concurrent.*;

public class ScheduledExecutorServiceDemo {

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        service.scheduleAtFixedRate(() -> {
            System.out.println(new java.util.Date());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }, 2000, 1000, TimeUnit.MILLISECONDS);

    }
}

/*

scheduleWithFixedDelay()
run:
Tue Nov 22 20:43:30 CST 2016
Tue Nov 22 20:43:33 CST 2016
Tue Nov 22 20:43:36 CST 2016
Tue Nov 22 20:43:39 CST 2016
Tue Nov 22 20:43:42 CST 2016
Tue Nov 22 20:43:45 CST 2016
...

scheduleWithFixedDelay() 可指定延迟多久首次执行 Runnable，执行完 Runnable 会排定延迟多久后再次执行。
由于是以上次 Runnable 完成执行后的时间为准，所以运行时间就是排定时间。

 java.util.Date 创建时，会取得当时系统时间，每次工作执行 2 秒，后延迟 1 秒。
*/

/*
scheduleAtFixedRate()

run:
Tue Nov 22 20:51:32 CST 2016
Tue Nov 22 20:51:34 CST 2016
Tue Nov 22 20:51:36 CST 2016
Tue Nov 22 20:51:38 CST 2016
..

scheduleAtFixedRate() 可指定延迟多久首次执行 Runnable，同时依据指定周期排定每次执行 Runnable 的时间，
如果上次 Runnable 运行时间未超过指定周期，则运行时间就是排定时间。
*/

/*
将 Thread.sleep(2000) -> Thread.sleep(500)

run:
Tue Nov 22 20:59:09 CST 2016
Tue Nov 22 20:59:10 CST 2016
Tue Nov 22 20:59:11 CST 2016
Tue Nov 22 20:59:12 CST 2016
Tue Nov 22 20:59:13 CST 2016
...

scheduleAtFixedRate()   由于每次工作执行不会超过排定周期，所以时间会 1 秒一间隔。

*/