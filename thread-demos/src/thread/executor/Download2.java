package thread.executor;

import java.net.URL;
import java.io.*;
import java.net.MalformedURLException;

public class Download2 {

    public static void main(String[] args) throws MalformedURLException {
        URL[] urls = {
            new URL("http://javaspecialists.eu/archive/Issue215.html"),
            new URL("https://linux.cn/article-5603-1.html")
        };

        String[] fileNames = {
            "StampedLock.html",
            "FixUbuntu.html"
        };

        new Pages(urls, fileNames, new ThreadPerTaskExecutor()).download();
    }
}
