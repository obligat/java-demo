package comparable;

import java.util.*;
import static java.util.Comparator.*;

public class Sort5 {

    public static void main(String[] args) {

        List words = Arrays.asList("d", "r", "t", "b", "f", "null","U","N","R");
        words.sort(nullsFirst(reverseOrder()));
        System.out.println(words);
    }
}

//  [t, r, null, f, d, b, U, R, N]