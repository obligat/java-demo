package trycatch;

import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Average {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        
        try {
            int ch = System.in.read();
        } catch (java.io.IOException ex) {
            ex.printStackTrace();
        }
        
        try {
            while (true) {
                int number = console.nextInt();
                if (number == 0) {
                    break;
                }
                sum += number;
                count++;
            }

        } catch (InputMismatchException ex) {
            System.out.printf("Ignore illegal input : %s %n", console.next());
        }
        System.out.printf("average is  %.2f %n", sum / count);
    }
}
