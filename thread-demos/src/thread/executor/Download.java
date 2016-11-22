package thread.executor;

import java.net.URL;
import java.io.*;

public class Download {

    public static void main(String[] args) throws Exception {
        URL[] urls = {
            new URL("http://javaspecialists.eu/archive/Issue215.html"),
            new URL("https://linux.cn/article-5603-1.html")
        };

        String[] fileNames = {
            "StampedLock.html",
            "FixUbuntu.html"
        };

        new Pages(urls, fileNames, new DirectExecutor()).download();
    }
}


/*
run:
BUILD SUCCESSFUL (total time: 3 seconds)
*/