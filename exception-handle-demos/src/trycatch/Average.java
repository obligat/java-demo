package trycatch;

import java.util.*;

public class Average {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double sum = 0;
        int count = 0;

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
