package tryCatchAndThrows;

public class AutoCloseableDemo {

    public static void main(String[] args) {
        try (Resource res = new Resource()) {
            res.doSome();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Resource implements AutoCloseable {

    void doSome() {
        System.out.println("do something");
    }

    @Override
    public void close() throws Exception {
        System.out.println("resource is closed.");
    }
}
