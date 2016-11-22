package thread.future;

import java.util.concurrent.*;
import static java.lang.System.*;

public class FutureCallableDemo {

    static long fibonacci(long n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) throws Exception {
        FutureTask<Long> the30thFibFuture = new FutureTask<>(() -> fibonacci(30));

        out.println("Boss, I want the 30th fibonacci number , I will catch it after a while ..");

        new Thread(the30thFibFuture).start();
        while (!the30thFibFuture.isDone()) {
            out.println("Buzing in other things ...");
        }

        out.printf("the 30th fibonacci number : %d %n", the30thFibFuture.get());
    }
}


/*

...
Buzing in other things ...
Buzing in other things ...
Buzing in other things ...
Buzing in other things ...
Buzing in other things ...
Buzing in other things ...
the 30th fibonacci number : 832040 
*/