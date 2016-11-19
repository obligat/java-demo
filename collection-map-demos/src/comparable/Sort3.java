
package comparable;

import java.util.*;

public class Sort3 {

    public static void main(String[] args) {
        List words = Arrays.asList("b","x","w","w","t","g","a");
        Collections.sort(words);
        System.out.println(words);
    }
}

//  [a, b, g, t, w, w, x]