import java.util.Random;

public class DiceRollSimulation {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();

        // Roll the first die
        int die1 = random.nextInt(6) + 1;

        // Roll the second die
        int die2 = random.nextInt(6) + 1;

        // Display the results
        System.out.println("Rolling the dice...");
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);

        // Calculate and display the total
        int total = die1 + die2;
        System.out.println("Total: " + total);
    }
}
