package set;

import java.util.*;

class Student {

    private String name;
    private String number;

    Student(String name, String number) {
        this.name = name;
        this.number = number;

    }

    @Override
    public String toString() {
        return String.format("(%s ,%s)", name, number);
    }

}

public class Students {

    public static void main(String[] args) {
        Set students = new HashSet();
        students.add(new Student("joy", "D1212"));
        students.add(new Student("lice", "D3312"));
        students.add(new Student("dd", "D5334"));
        students.add(new Student("dd", "D5334"));
        
        System.out.println(students);
    }
}

//[(joy ,D1212), (lice ,D3312), (dd ,D5334), (dd ,D5334)]