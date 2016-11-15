package tryCatchAndThrows;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    public static String readFile(String name) throws FileNotFoundException {
        StringBuilder text = new StringBuilder();
        try (Scanner console = new Scanner(new FileInputStream(name))) {
            while (console.hasNext()) {
                text.append(console.nextLine())
                        .append("\n");
            }
        }
        return text.toString();
    }
}
