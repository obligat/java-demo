package dateAndCalendar;

import java.text.*;
import java.util.*;

public class HowOld {
    
    public static void main(String[] args) throws ParseException {
        System.out.println("Putin your brithday (yyyy-mm-dd):");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date birthDate = dateFormat.parse(new Scanner(System.in).nextLine());
        Date currentDate = new Date();
        long life = currentDate.getTime() - birthDate.getTime();
        System.out.println("Your age is :" + (life / (365 * 24 * 60 * 60 * 1000L)));
    }
}

/*
 this way not good ...
*/