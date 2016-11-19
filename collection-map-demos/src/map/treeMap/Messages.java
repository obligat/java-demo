
package map.treeMap;

import java.util.*;
import static java.lang.System.out;

public class Messages {

    public static void main(String[] args) {
        Map<String, String> messages = new TreeMap();
        messages.put("Justin", "Hello ! Justin's message.");
        messages.put("Monica", "Hello ! Monica's message.");
        messages.put("Irene", "Hello ! Irene's message.");
        
        out.println(messages);

    }
}

// {Irene=Hello ! Irene's message., Justin=Hello ! Justin's message., Monica=Hello ! Monica's message.}
