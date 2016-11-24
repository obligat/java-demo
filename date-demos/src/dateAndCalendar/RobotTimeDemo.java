
package dateAndCalendar;

import static java.lang.System.out;
import java.util.Calendar;

public class RobotTimeDemo {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(1975,Calendar.MARCH,31,23,59,59);
        out.println(c.getTime().getTime());
        c.add(Calendar.SECOND, 1);
        out.println(c.getTime().getTime());
    }
}

/*
run:
165513599938
165513600938
*/

/*
 get epoch seconds is really credibility.
*/