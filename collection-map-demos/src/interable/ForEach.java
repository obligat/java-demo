package interable;

import java.util.*;
import static java.lang.System.out;

public class ForEach {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Justion", "Kotton", "Moods");
        
        names.forEach(out::println);
        new HashSet(names).forEach(out::println);
        new ArrayDeque(names).forEach(out::println);
    }
}

