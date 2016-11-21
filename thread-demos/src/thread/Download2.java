package thread;

import java.io.*;
import java.net.URL;

public class Download2 {

    public static void main(String[] args) throws Exception {

        URL[] urls = {
            new URL("http://openhome.cc/Gossip/Encoding"),
            new URL("http://openhome.cc/Gossip/Scala"),
            new URL("http://openhome.cc/Gossip/JavaScript")
        };

        String[] fileNames = {
            "encode.html",
            "scala.html",
            "javascript.html"
        };

        for (int i = 0; i < urls.length; i++) {
            int index = i;
            new Thread(() -> {
                try {
                    dump(urls[index].openStream(),
                            new FileOutputStream(fileNames[index]));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }).start();
        }
    }

    static void dump(InputStream src, OutputStream dest) throws IOException {

        try (InputStream input = src; OutputStream output = dest) {
            byte[] data = new byte[1024];
            int length;
            while ((length = input.read(data)) != -1) {
                output.write(data, 0, length);
            }
        }
    }
}

//run: time random
//BUILD SUCCESSFUL (total time: 1 second)
