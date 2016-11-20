package Stream;

import java.io.*;

public class CharUtilTest {

    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader(args[0]);
        StringWriter writer = new StringWriter();
        CharUtil.dump(reader, writer);
        System.out.println(writer.toString());
    }
}
