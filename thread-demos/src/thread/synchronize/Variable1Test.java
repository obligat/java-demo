package thread.synchronize;

class Variable1 {

    static int i = 0, j = 0;

    static void one() {
        i++;
        j++;
    }

    static void two() {
        System.out.printf("i = %d, j = %d %n", i, j);
    }
}

public class Variable1Test {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                Variable1.one();
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                Variable1.two();
            }
        });

        thread1.start();
        thread2.start();
    }
}


/*
...
i = 1002696171, j = 1002696178 
i = 1002697200, j = 1002697206 
i = 1002698267, j = 1002698273 
i = 1002699212, j = 1002699211 
i = 1002700229, j = 1002700228 
i = 1002701614, j = 1002701614
...

解析：

 j >> i ^@_@^

    会发生死结的原因在于， t1 在调用 resource1.cooperate(resource2) 时，会取得 resource1 的锁定，
若此时 t2 也正好在调用 resource2.cooperate(resource1)，会取得 resource2 的锁定，凑巧 t1 现在打算
运用传入的 resource2 调用 doSome()，理应取得 resource2 的锁定，但锁定被 resource2 拿走了，于是 t1 
进入阻断，同理，t2 也进入等待。

    在不加 synchronized 的时候，为何会出现 j > i ? 为了效率，线程可以快取变量的值，在 thread2 调用
Variable1.two() 从共享内存中的 i 变量取得值后，会快取于自己地方内存空间中，如果此时切换至 thread1 不断
执行 Variable1.one() 多次， 共享内存中的 i 值已被变更多次，再切回 thread2 取得 j 值在自己的内存空间，
然后将自己内存空间中快取的值输出，因此有可能出现 j > i 。

*/