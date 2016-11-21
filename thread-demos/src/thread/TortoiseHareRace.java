package thread;

import static java.lang.System.out;

public class TortoiseHareRace {

    public static void main(String[] args) {

        boolean[] flags = {true, false};
        int totalStep = 10;
        int tortoiseStep = 0;
        int hareStep = 0;

        out.println("tortoise and hare race begin...");

        while (tortoiseStep < totalStep && hareStep < totalStep) {

            tortoiseStep++;
            out.printf("tortoise runs %d steps ...%n", tortoiseStep);

            boolean isHareSleep = flags[((int) (Math.random() * 10)) % 2];

            if (isHareSleep) {
                out.println("hare is sleeping...");
            } else {
                hareStep += 2;
                out.printf("hare runs %d steps...%n", hareStep);
            }
        }
    }
}
