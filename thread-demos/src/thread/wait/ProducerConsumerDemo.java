package thread.wait;

public class ProducerConsumerDemo {

    public static void main(String[] args) {

        Clerk clerk = new Clerk();
        new Thread(new Producer(clerk)).start();
        new Thread(new Consumer(clerk)).start();
    }
}


/*
run:
Producer is producting ...
Producer sets (1) 
Consumer is consuming ...
Consumer get (1) 
Producer sets (2) 
Consumer get (2) 
Producer sets (3) 
Consumer get (3) 
Producer sets (4) 
Consumer get (4) 
Producer sets (5) 
Consumer get (5)
*/
