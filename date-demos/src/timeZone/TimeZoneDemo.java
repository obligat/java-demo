package timeZone;

import static java.lang.System.out;
import java.util.TimeZone;

public class TimeZoneDemo {

    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getDefault();
        out.println(timeZone.getDisplayName());
        out.println("\t TimeZone ID: " + timeZone.getID());
        out.println("\t Dayligh Saving Time: " + timeZone.getDSTSavings());
        out.println("\t UTC offset seconds: " + timeZone.getRawOffset());
    }
}

/*
run:
China Standard Time
	 TimeZone ID: Asia/Chongqing
	 Dayligh Saving Time: 0
	 UTC offset seconds: 28800000
*/