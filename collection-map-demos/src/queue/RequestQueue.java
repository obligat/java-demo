package queue;

import java.util.*;

interface Request {

    void execute();
}

public class RequestQueue {

    public static void main(String[] args) {
        Queue requests = new LinkedList();
        offerRequestTo(requests);
        process(requests);
    }

    static void offerRequestTo(Queue requests) {

        for (int i = 1; i < 6; i++) {
            Request request = new Request() {
                public void execute() {
                    System.out.printf("execute data %f%n", Math.random());
                }
            };
            requests.offer(request);
        }

    }

    static void process(Queue requests) {
        while (requests.peek() != null) {
            Request request = (Request) requests.poll();
            request.execute();
        }
    }
}
