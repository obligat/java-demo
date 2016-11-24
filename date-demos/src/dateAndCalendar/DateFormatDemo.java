package dateAndCalendar;

import java.util.*;
import static java.lang.System.out;
import static java.text.DateFormat.*;

public class DateFormatDemo {

    public static void main(String[] args) {

        Date date = new Date();
        dateInstanceDemo(date);
        timeInstanceDemo(date);
        dateTimeInstanceDemo(date);
    }

    static void dateInstanceDemo(Date date) {
        out.println("getDateInstance() demo");
        out.printf("\t SHORT: %s %n", getDateInstance(LONG).format(date));
        out.printf("\t SHORT: %s %n", getDateInstance(SHORT).format(date));
    }

    static void timeInstanceDemo(Date date) {
        out.println("getTimeInstance() demo");
        out.printf("\t LONG: %s %n", getTimeInstance(LONG).format(date));
        out.printf("\t MEDIUM: %s %n", getTimeInstance(MEDIUM).format(date));
        out.printf("\t SHORT: %s %n", getTimeInstance(SHORT).format(date));
    }

    static void dateTimeInstanceDemo(Date date) {
        out.println("getDateTimeInstance() demo");
        out.printf("\t LONG: %s %n", getDateTimeInstance(LONG, LONG).format(date));
        out.printf("\t MEDIUM: %s %n", getDateTimeInstance(SHORT, MEDIUM).format(date));
        out.printf("\t SHORT: %s %n", getDateTimeInstance(SHORT, SHORT).format(date));
    }
}


/*
run:
getDateInstance() demo
	 SHORT: November 24, 2016 
	 SHORT: 11/24/16 
getTimeInstance() demo
	 LONG: 4:22:37 PM CST 
	 MEDIUM: 4:22:37 PM 
	 SHORT: 4:22 PM 
getDateTimeInstance() demo
	 LONG: November 24, 2016 4:22:37 PM CST 
	 MEDIUM: 11/24/16 4:22:37 PM 
	 SHORT: 11/24/16 4:22 PM 
*/