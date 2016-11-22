package thread.collection;

import java.util.concurrent.*;

public class PCD3 {

    public static void main(String[] args) {
        BlockingQueue queue = new ArrayBlockingQueue(1);
        new Thread(new Producer3(queue)).start();
        new Thread(new Consumer3(queue)).start();
    }
}


/*

run:
Producer3 begin producting...
Consumer3 begin consuming Integer ...
Producer3 provide integer (1) 
Consumer3 consuemed Integer (1) 
Producer3 provide integer (2) 
Consumer3 consuemed Integer (2) 
Consumer3 consuemed Integer (3) 
Producer3 provide integer (3) 
Producer3 provide integer (4) 
Consumer3 consuemed Integer (4)
*/