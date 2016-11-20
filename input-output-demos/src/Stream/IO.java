package Stream;

import java.io.*;

public class IO {

//        数据来源与目的地
    public static void dump(InputStream src, OutputStream dest) throws IOException {

//         尝试自动关闭资源
        try (InputStream input = src; OutputStream output = dest) {

//          尝试每次从资源读取 1024 字节
            byte[] data = new byte[1024];
            int length;

//          读取数据
            while ((length = input.read(data)) != -1) {

//              写出数据
                output.write(data, 0, length);
            }
        }
    }
}
