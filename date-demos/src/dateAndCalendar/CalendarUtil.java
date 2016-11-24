package dateAndCalendar;

import static java.lang.System.out;
import java.util.Calendar;

public class CalendarUtil {

    public static void main(String[] args) {
        Calendar birth = Calendar.getInstance();
        birth.set(1975, Calendar.MAY, 26);
        Calendar now = Calendar.getInstance();
        out.printf("Years : %d %n", yearsBetween(birth, now));
        out.printf("Days : %d %n", daysBetween(birth, now));
    }

    public static long yearsBetween(Calendar begin, Calendar end) {
        Calendar calendar = (Calendar) begin.clone();
        long years = 0;
        while (calendar.before(end)) {
            calendar.add(Calendar.YEAR, 1);
            years++;
        }

        return years - 1;
    }

    public static long daysBetween(Calendar begin, Calendar end) {
        Calendar calendar = (Calendar) begin.clone();
        long days = 0;
        while (calendar.before(end)) {
            calendar.add(Calendar.DATE, 1);
            days++;
        }

        return days - 1;
    }
}

/*
run:
Years : 41 
Days : 15158 
*/

/*
 在 Calendar 实例上进行 add() 之类的操作，会修改 Calendar 实例本身，
所以有了 clone() 复制对象的动作。
*/