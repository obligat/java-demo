package queue;

import java.util.*;

interface Request {

    void execute();
}

public class RequestQueue {

    public static void main(String[] args) {

        Queue<Request> requests = new LinkedList<>();
        offerRequestTo(requests);
        process(requests);
    }

    static void offerRequestTo(Queue<Request> requests) {

        for (int i = 1; i < 6; i++) {

            requests.offer(
                    () -> System.out.printf("execute data %f%n", Math.random())
            );
        }
    }

    static void process(Queue<Request> requests) {
        while (requests.peek() != null) {
            Request request = (Request) requests.poll();
            request.execute();
        }
    }
}
