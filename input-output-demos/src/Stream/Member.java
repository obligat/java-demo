package Stream;

import java.io.*;

public class Member {

    private String number;
    private String name;
    private int age;

    public Member(String number, String name, int age) {
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
        
//        建立 DataOutputStream 打包 FileOutputStream
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream(number))) {

//          根据不同的类型调用 writeXXX() 方法
            output.writeUTF(number);
            output.writeUTF(name);
            output.writeInt(age);
        }

    }

    public static Member load(String number) throws IOException {
        
        Member member;
        
//      建立 DataInputStream 打包 FileInputStream
        try (DataInputStream input = new DataInputStream(new FileInputStream(number))) {
            
//            根据不同类型调用 readXXX() 方法
            member = new Member(input.readUTF(), input.readUTF(), input.readInt());
        }

        return member;
    }
}
