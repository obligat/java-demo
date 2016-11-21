package thread.synchronize;

class Variable3 {

    volatile static int i = 0, j = 0;

    static void one() {
        i++;
        j++;
    }

    static void two() {
        System.out.printf("i = %d, j = %d %n", i, j);
    }
}

public class Variable3Test {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                Variable3.one();
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                Variable3.two();
            }
        });

        thread1.start();
        thread2.start();
    }
}



/*
...
i = 122938708, j = 122938708 
i = 122939058, j = 122939058 
i = 122939529, j = 122939529 
i = 122939894, j = 122939893 
i = 122940351, j = 122940350 
i = 122940800, j = 122940799 
...

i = j or i > j or i < j
*/

