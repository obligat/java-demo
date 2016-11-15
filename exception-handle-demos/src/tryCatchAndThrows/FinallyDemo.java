package tryCatchAndThrows;

public class FinallyDemo {

    public static void main(String[] args) {
        System.out.println(test(true));
    }

    static int test(boolean flag) {
        try {
            if (flag) {
                return 1;           //although result is return 1,finally code run over anyway.
            }
        } finally {
            System.out.println("finally..");
        }

        return 0;

    }
}
