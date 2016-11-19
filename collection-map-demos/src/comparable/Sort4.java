package comparable;

import java.util.*;

class StringComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return -s1.compareTo(s2);
    }
}

public class Sort4 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("d", "g", "w", "a", "l");
        Collections.sort(words, new StringComparator());
        System.out.println(words);
    }
}

//  [w, l, g, d, a]
