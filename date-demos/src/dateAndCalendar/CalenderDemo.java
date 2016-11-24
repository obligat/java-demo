package dateAndCalendar;

import static java.lang.System.out;
import java.util.Calendar;

public class CalenderDemo {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        
        calendar.set(1582, Calendar.OCTOBER, 15);
        
//        显示格里高历 1582 年 10 月 15 日
        out.println(calendar.getTime());
        
//        往前一天
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        
//        显示儒略历 1582 年 10 月 4 日
        out.println(calendar.getTime());
    }
}


/*
run:
Fri Oct 15 17:25:26 CST 1582
Thu Oct 04 17:25:26 CST 1582
*/