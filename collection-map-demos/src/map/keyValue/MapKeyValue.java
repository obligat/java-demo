package map.keyValue;

import java.util.*;
import static java.lang.System.out;

public class MapKeyValue {
    
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("one ", "1");
        map.put("two ", "2");
        map.put("three ", "3");
        
        out.println("show key");
        
        map.keySet().forEach(key -> out.println(key));
        
        out.println("show value");
        
        map.values().forEach(key -> out.println(key));
    }
}


//  show key
//  two 
//  three 
//  one 
//  show value
//  2
//  3
//  1