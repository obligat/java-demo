package thread.executor;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Download3 {

    public static void main(String[] args) throws Exception {
        URL[] urls = {
            new URL("http://javaspecialists.eu/archive/Issue215.html"),
            new URL("https://linux.cn/article-5603-1.html")
        };

        String[] fileNames = {
            "StampedLock.html",
            "FixUbuntu.html"
        };

        ExecutorService executorService = Executors.newCachedThreadPool();
        new Pages(urls, fileNames, executorService).download();
        executorService.shutdown();
    }
}
