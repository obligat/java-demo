package Stream;

import java.io.*;

public class CharUtil {
    
    
//    读取数据来源， 输出数据目的地， 客户端要处理异常
    public static void dump(Reader src, Writer dest) throws IOException {
        
//        尝试自动关闭资源
        try (Reader input = src; Writer output = dest) {
            
//            尝试每次从来源读取 1024 字符
            char[] data = new char[1024];
            int length;
            
//            读取数据
            while ((length = input.read(data)) != -1) {
                
//                写出数据
                output.write(data, 0, length);
            }
        }
    }
}
