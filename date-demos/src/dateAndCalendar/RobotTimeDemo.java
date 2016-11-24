
package dateAndCalendar;

import static java.lang.System.out;
import java.util.Calendar;

public class RobotTimeDemo {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(1975,Calendar.MARCH,31,23,59,59);
        out.println(c.getTime());
        c.add(Calendar.SECOND, 1);
        out.println(c.getTime());
    }
}

/*
run:
Mon Mar 31 23:59:59 CST 1975
Tue Apr 01 00:00:00 CST 1975
*/

/*
But not appear Daylight Saving Time .
*/
