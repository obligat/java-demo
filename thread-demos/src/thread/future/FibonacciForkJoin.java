package thread.future;

import java.util.concurrent.*;

//  继承 RecursiveTaskk
class Fibonacci extends RecursiveTask<Long> {
    
    final long n;
    
    Fibonacci(long n) {
        this.n = n;
    }
    
    @Override
    public Long compute() {
        
//        20 一下就不分解了，以子任务过多造成负担
        if (n <= 20) {
            return solveFibonacciSequentially(n);
        }
        
//        分解出 n-1 子任务，请 ForkJoinPool 分配线程来执行这个子任务
        ForkJoinTask<Long> subTask = new Fibonacci(n - 1).fork();
        
//        分解出 n-2 子任务并直接运算，  subTask.join()：取得此子任务执行结果
        return new Fibonacci(n - 2).compute() + subTask.join();
    }
    
    static long solveFibonacciSequentially(long n) {
        if (n <= 1) {
            return n;
        }
        return solveFibonacciSequentially(n - 1) + solveFibonacciSequentially(n - 2);
    }
}

public class FibonacciForkJoin {
    
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(45);
        ForkJoinPool pool = new ForkJoinPool();
        
//        开始分而治之
        System.out.println(pool.invoke(fibonacci));
    }
}
