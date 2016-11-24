package dateAndCalendar;

import java.util.*;
import static java.lang.System.*;

public class DateDemo {
    
    public static void main(String[] args) {
        Date date1 = new Date(currentTimeMillis());
        Date date2 = new Date();
        
        out.println(date1.getTime());
        out.println(date2.getTime());
    }
}


/*
run:
1479974531879
1479974531879
*/