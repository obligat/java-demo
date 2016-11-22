package thread.future;

import java.util.concurrent.*;
import static java.lang.System.*;

public class FutureCallableDemo2 {

    static long fibonacci(long n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newCachedThreadPool();

        out.println("Boss, I want the 30th fibonacci number , I will catch it after a while ..");

        Future<Long> the30thFibFuture = service.submit(() -> fibonacci(30));

        while (!the30thFibFuture.isDone()) {
            out.println("Buzing in other things ...");
        }

        out.printf("the 30th fibonacci number : %d %n", the30thFibFuture.get());
    }
}
