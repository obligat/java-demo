package thread.future;

import java.util.concurrent.*;

public class ScheduledExecutorServiceDemo {

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        service.scheduleWithFixedDelay(() -> {
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
run:
Tue Nov 22 20:43:30 CST 2016
Tue Nov 22 20:43:33 CST 2016
Tue Nov 22 20:43:36 CST 2016
Tue Nov 22 20:43:39 CST 2016
Tue Nov 22 20:43:42 CST 2016
Tue Nov 22 20:43:45 CST 2016
...

 java.util.Date 创建时，会取得当时系统时间，每次工作执行 2 秒，后延迟 1 秒。
*/