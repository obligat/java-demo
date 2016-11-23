
import java.util.Arrays;

public class StringOrderDemo {

    public static void main(String[] args) {
        String[] names = {"Justin", "caterpillar", "Bush"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}


/*
run:
[Bush, caterpillar, Justin]
*/