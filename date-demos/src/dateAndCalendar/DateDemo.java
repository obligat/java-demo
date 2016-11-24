package dateAndCalendar;

import java.util.*;
import static java.lang.System.*;

public class DateDemo {
    
    public static void main(String[] args) {
        Date date1 = new Date(currentTimeMillis());
        Date date2 = new Date();
        
        out.println(date1.getTime());
        out.println(date2.getTime());
    }
}


/*
run:
1479974531879
1479974531879
*/

/*
 Date 有两个构造函数可以用，一个可使用 epoch 毫秒数构建，一个为无自变量构造函数，
内部亦是使用 System.currentTimeMillis() 取得 epoch 毫秒数，调用 getTime() 
可取得内部保存的 epoch 毫秒数值。

 Date 其他版本的构造函数已废除，除 getTime() setTime() ， 其他的 getXXX()
setXXX() 也已废除。

也就是说，有关字符串时间格式的处理，不再是 Date 的职责。

*/