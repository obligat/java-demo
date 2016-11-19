package map.hashMap;

import java.util.*;
import static java.lang.System.out;

public class Messages {

    public static void main(String[] args) {
        Map<String, String> messages = new HashMap();
        messages.put("Justin", "Hello ! Justin's message.");
        messages.put("Monica", "Hello ! Monica's message.");
        messages.put("Irene", "Hello ! Irene's message.");

        Scanner console = new Scanner(System.in);
        out.print("fetch whose message: ");
        String message = messages.get(console.nextLine());
        out.println(message);
        out.println(messages);

    }
}


//  fetch whose message: Justin
//  Hello ! Justin's message.
//  {Irene=Hello ! Irene's message., Justin=Hello ! Justin's message., Monica=Hello ! Monica's message.}
