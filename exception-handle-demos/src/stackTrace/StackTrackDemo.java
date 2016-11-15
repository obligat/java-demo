package stackTrace;

public class StackTrackDemo {

    public static void main(String[] args) {
        try {
            c();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }

    static void c() {
        try {
            b();                        //rethrow root also is beginner
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    static void b() {
        a();
    }

    static String a() {
        String text = null;
        return text.toUpperCase();
    }
}
