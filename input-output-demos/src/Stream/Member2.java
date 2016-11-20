package Stream;

import java.io.*;


//  操作 Serializable
public class Member2 implements Serializable {

    private String number;
    private String name;
    private int age;

    public Member2(String number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("(%s , %s , %d )", number, name, age);
    }

    public void save() throws IOException {
        
//      建立 Object OutputStream 打包 FileOutputStream
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(number))) {
            
//            调用 writeObject() 方法写出对象
            output.writeObject(this);
        }
    }

    public static Member2 load(String number) throws IOException, ClassNotFoundException {
        Member2 member;

//        建立 Object InputStream 打包 FileInputStream
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(number))) {
            member = (Member2) input.readObject();
        }
        return member;
    }
}
