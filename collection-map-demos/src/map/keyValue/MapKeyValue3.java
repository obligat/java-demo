package map.keyValue;

import java.util.*;

public class MapKeyValue3 {

    public static void main(String[] args) {

        Map map = new TreeMap();

        map.put("one ", "1");
        map.put("two ", "2");
        map.put("three ", "3");

        map.forEach((key, value) -> System.out.printf("(key %s, value %s) %n ", key, value));

    }
}


// (key one , value 1) 
// (key three , value 3) 
// (key two , value 2)