import java.util.Random;

public class BridgeWalk {
    public static void main(String[] args) {
        Random rand = new Random();
        int bridgeLength = 7;
        int trials = 50;
        int totalSteps = 0;
        int maxSteps = 0;

        for (int i = 0; i < trials; i++) {
            int position = bridgeLength / 2;
            int steps = 0;

            while (position >= 0 && position <= bridgeLength) {
                steps++;
                if (rand.nextBoolean()) {
                    position++;
                } else {
                    position--;
                }
            }

            totalSteps += steps;

            if (steps > maxSteps) {
                maxSteps = steps;
            }
        }

        double averageSteps = (double) totalSteps / trials;
        System.out.println("Average number of steps before stepping off the bridge: " + averageSteps);
        System.out.println("Greatest number of steps in any trial: " + maxSteps);
    }
}


