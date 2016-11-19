package map.treeMap;

import java.util.*;
import static java.lang.System.out;

public class MessagesReverse {
    
    public static void main(String[] args) {
        Map<String, String> messages = new TreeMap<>((s1, s2) -> -s1.compareTo(s2));
        messages.put("Justin", "Hello ! Justin's message.");
        messages.put("Monica", "Hello ! Monica's message.");
        messages.put("Irene", "Hello ! Irene's message.");
        
        out.println(messages);
        
    }
}


// {Monica=Hello ! Monica's message., Justin=Hello ! Justin's message., Irene=Hello ! Irene's message.}
