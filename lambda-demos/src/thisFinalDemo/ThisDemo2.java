package thisFinalDemo;

import static java.lang.System.out;

class Hello2 {

    Runnable r1 = () -> out.println(this);
    Runnable r2 = () -> out.println(toString());

    public String toString() {
        return "hello world";
    }
}

public class ThisDemo2 {

    public static void main(String[] args) {
        Hello2 hello = new Hello2();
        hello.r1.run();
        hello.r2.run();
    }
}


/*
run:
hello world
hello world

Lambda 表达式中 this 的参考对象以及 toString()(也就是 this.toString())的接受者,
来自 Lambda 的周围环境 (Context)，也就是看 Lambda 表达式是在哪个名称范畴 (Scope)，
就能参考该范畴内的名称，像是变量或方法。

上面例子中， Hello 类包围了 Lambda 表达式， Lambda 表达式可以参考类范畴中的名称，
例子中定义了 Hello 类的 toString() ，因而执行结果返回两次 "hello world"。

说明 Lambda 表达式不是匿名类的语法糖。
*/