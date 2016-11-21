package thread;

public class Hare implements Runnable {

    private boolean[] flags = {true, false};
    private int totalStep;
    private int step;

    public Hare(int totalStep) {
        this.totalStep = totalStep;
    }

    @Override
    public void run() {

        while (step < totalStep) {

            boolean isHareSleep = flags[((int) (Math.random() * 10)) % 2];

            if (isHareSleep) {
                System.out.println("Hare is sleeping ...");
            } else {
                step += 2;
                System.out.printf("hare has run %d steps ... %n", step);
            }
        }
    }
}
