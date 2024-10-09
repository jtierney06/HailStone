import java.util.ArrayList;

public class Hailstone {
    public static void main(String[] args) {
        int randomStart = (int)(Math.random() * 200) + 1; 
        System.out.println("Random starting number: " + randomStart);

        int maxIterations = 0;
        int maxIterationsStartNum = 0;
        int range = 200;  

        for (int startNum = 1; startNum <= range; startNum++) {
            int num = startNum;
            ArrayList<Integer> sequence = new ArrayList<>();
            int iterations = 0;

            while (!sequence.contains(num)) {
                sequence.add(num);
                iterations++;

                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = 3 * num + 1;
                }
            }

            if (iterations > maxIterations) {
                maxIterations = iterations;
                maxIterationsStartNum = startNum;
            }
        }

        System.out.println("Number with most iterations: " + maxIterationsStartNum);
        System.out.println("Iterations: " + maxIterations);
    }
}

