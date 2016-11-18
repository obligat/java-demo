
package set;

import java.util.*;

public class WordCount {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("please input English:");
        Set words = tokenSet(console.nextLine());
        System.out.printf("no repeat words have %d : %s %n", words.size(),words );
    }
    
    static Set tokenSet(String line){
        String[] tokens = line.split(" ");
        return new HashSet(Arrays.asList(tokens));
    }
}
