package comparable;

import java.util.*;

public class Sort4 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("d", "g", "w", "a", "l");
        Collections.sort(words, (s1, s2) -> -s1.compareTo(s2));
        System.out.println(words);
    }
}

//  [w, l, g, d, a]
