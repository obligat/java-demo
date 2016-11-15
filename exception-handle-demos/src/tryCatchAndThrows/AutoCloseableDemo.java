package tryCatchAndThrows;

public class AutoCloseableDemo {

    public static void main(String[] args) {
        try (ResourceSome some = new ResourceSome();
                ResourceOther other = new ResourceOther()) {
            some.doSome();
            other.doOther();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class ResourceSome implements AutoCloseable {

    void doSome() {
        System.out.println("do something");
    }

    @Override
    public void close() throws Exception {
        System.out.println("resourceSome is closed.");
    }
}

class ResourceOther implements AutoCloseable {

    void doOther() {
        System.out.println("do otherthing.");
    }

    @Override
    public void close() throws Exception {
        System.out.println("resourceOther is closed.");
    }
}

//  result :
//
//  do something
//  do otherthing.
//  resourceOther is closed.
//  resourceSome is closed.