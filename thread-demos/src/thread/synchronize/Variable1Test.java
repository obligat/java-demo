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

//...
//i = 1002696171, j = 1002696178 
//i = 1002697200, j = 1002697206 
//i = 1002698267, j = 1002698273 
//i = 1002699212, j = 1002699211 
//i = 1002700229, j = 1002700228 
//i = 1002701614, j = 1002701614
//...

// j >> i ^@_@^