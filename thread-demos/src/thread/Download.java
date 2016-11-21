package thread;

import java.net.URL;
import java.io.*;
import java.net.MalformedURLException;

public class Download {

    public static void main(String[] args) throws MalformedURLException, IOException {

        URL[] urls = {
            new URL("http://openhome.cc/Gossip/Encoding"),
            new URL("http://openhome.cc/Gossip/Scala"),
            new URL("http://openhome.cc/Gossip/JavaScript")
        };

        String[] fileNames = {
            "Encoding.html",
            "Scala.html",
            "JavaScript.html"
        };

        for (int i = 0; i < urls.length; i++) {
            dump(urls[i].openStream(), new FileOutputStream(fileNames[i]));
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


//run:
//BUILD SUCCESSFUL (total time: 3 seconds)