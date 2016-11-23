package thisFinalDemo;

import static java.lang.System.out;

class Hello {

    Runnable r1 = new Runnable() {
        public void run() {
            out.println(this);
        }
    };

    Runnable r2 = new Runnable() {
        public void run() {
            out.println(toString());
        }
    };

    public String toString() {
        return "Hello World";
    }
}

public class ThisDemo {

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.r1.run();
        hello.r2.run();
    }
}


/*

run:
thisFinalDemo.Hello$1@6bc7c054
thisFinalDemo.Hello$2@232204a1

this 的参考对象以及 toString()(也就是 this.toString())的接受者，实际上都是匿名类建立的实例，
也就是 Runnable 的实例，由于没有定义 Runnable 的 toString()，因此结果显示 Object 默认的 toString()
返回字符串(包括类名和十六进制哈希码)。

Object 的 toString() 默认定义：

public String toString(){
    return getClass().getName() + “@” + Integer.toHexString(hasCode());
}

*/