package methodReference;

import static java.lang.System.out;
import java.util.*;
import java.util.function.Function;

class Person {

    String name;
    
    Person(String name) {
        this.name = name;
    }
    
    public String toString() {
        return "Person {" + "name = " + name + "}";
    }
}

public class MethodReferenceDemo {
    
    static <P, R> List<R> map(List<P> list, Function<P, R> mapper) {
        List<R> mapped = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            mapped.add(mapper.apply(list.get(i)));
        }
        
        return mapped;
    }
    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("a","b","c");
        List<Person> persons = map(names,Person::new);
        persons.forEach(out::println);
    }
}

/*
run:
Person {name = a}
Person {name = b}
Person {name = c}

上面的写法是直接参考 Person 的构造函数。
直接用 name 来调用 Person 的构造函数,跟方法参考没有区别：
  List<Person> persons = map(names,name -> new Person(name));

方法参考可以参考
静态方法的函数接口、特定对象的实例方法、构造函数参考(构造函数的返回值是定义他们的类本身)。
*/
