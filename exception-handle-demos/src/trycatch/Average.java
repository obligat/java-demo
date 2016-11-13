package trycatch;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        double sum = 0;
        int count = 0;

        while (true) {
            int number = nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
            count++;
        }
        System.out.printf("average is  : %s %n", sum/count);
    }
    
    static Scanner console = new Scanner(System.in);
    
    static int nextInt(){
        String input = console.next();
        while(!input.matches("\\d*")){
        System.out.println("please input number");
        input = console.next();
        }
        
        return Integer.parseInt(input);
    
    }
}
