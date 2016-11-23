
import java.util.Arrays;

public class StringOrderDemo {

    public static void main(String[] args) {
        String[] names = {"Justin", "caterpillar", "Bush"};
        Arrays.sort(names, (s1,s2)->StringOrder.byLength(s1, s2));
        System.out.println(Arrays.toString(names));
    }
}


/*
run:
[Bush, Justin, caterpillar]
*/