package Stream;

import java.io.*;

public class StandardOut {

    public static void main(String[] args) throws FileNotFoundException {
        try (PrintStream printStream = new PrintStream(
                new FileOutputStream(args[0])
        )) {
            System.setOut(printStream);
            System.out.println("HelloWorld");
        }
    }
}
