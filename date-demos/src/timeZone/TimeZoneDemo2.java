package timeZone;

import java.util.*;
import static java.lang.System.out;

public class TimeZoneDemo2 {

    public static void main(String[] args) {
        TimeZone chongqing = TimeZone.getTimeZone("Asia/Chongqing");
        Calendar calendar = Calendar.getInstance(chongqing);
        showTime(calendar);

        TimeZone copehagen = TimeZone.getTimeZone("Europe/Copenhagen");
        calendar.setTimeZone(copehagen);
        showTime(calendar);
    }

    static void showTime(Calendar calendar) {
        out.print(calendar.getTimeZone().getDisplayName());
        out.printf(" %d: %d %n", calendar.get(Calendar.HOUR), calendar.get(Calendar.MINUTE));
    }
}


/*
run:
China Standard Time 6: 10 
Central European Time 11: 10 
*/