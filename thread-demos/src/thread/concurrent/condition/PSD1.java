package thread.concurrent.condition;

public class PSD1 {

    public static void main(String[] args) {

        Clerk clerk = new Clerk();
        new Thread(new Producer(clerk)).start();
        new Thread(new Consumer(clerk)).start();
    }
}


/*
run:
Producer is producting ...
Consumer is consuming ...
Producer sets (1) 
Consumer gets (1) 
Producer sets (2) 
Consumer gets (2) 
Producer sets (3) 
Consumer gets (3) 
Producer sets (4) 
Consumer gets (4) 
Producer sets (5) 
Consumer gets (5) 
*/