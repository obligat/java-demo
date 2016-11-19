package map.keyValue;

import java.util.*;

public class MapKeyValue2 {

    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("one ", "1");
        map.put("two ", "2");
        map.put("three ", "3");

        foreach(map.entrySet());
    }

    static void foreach(Iterable<Map.Entry<String, String>> iterable) {
        for (Map.Entry<String, String> entry : iterable) {
            System.out.printf("(key %s, value %s)%n", entry.getKey(), entry.getValue());
        }
    }
}

//(key one , value 1)
//(key three , value 3)
//(key two , value 2)