package interable;

import java.util.*;

public class ForEach {

    public static void main(String[] args) {
        List names = Arrays.asList("Justion", "Kotton", "Moods");
        forEach(names);
        forEach(new HashSet(names));
        forEach(new ArrayDeque(names));
    }

    static void forEach(Iterable iterable) {
        for (Object o : iterable) {
            System.out.println(o);
        }
    }
}

// result:
//Justion
//Kotton
//Moods
//Justion
//Kotton
//Moods
//Justion
//Kotton
//Moods

// 解析： 使用了 java.util.Arrays 的 static 方法 asList(), 这个方法接受不定长度自变量，
// 可将指定的自变量收集为 List，List 是一种 Iterable ，所以可以使用 forEach() 方法。
// HashSet 具有接受 Collection 的构造函数，List 是一种 Collection ，所以可以用来创建 HashSet，
// Set 是一种 Iterable ，所以可以使用 forEach() 方法。
// 同理， ArrayDeque 具有接受 Collection 的构造函数， List 是一种 Collection ，所以可以创建 ArrayDeque，
// Deque 是一种 Iterable，所以可以使用 forEach() 方法。