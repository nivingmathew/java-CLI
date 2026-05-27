
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingNumber {

    private static final int EASY_MAX = 100;
    private static final int HARD_MAX = 500;

    public static void main(String[] args) {
        int secretNumber;
        String checking;

        System.out.println("-----Welcome to Number Guessing Game-----");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect the difficulty level\n1-Easy (1-100)\n2-Hard (1-500)");

            int level = sc.nextInt();

            if (level == 1) {
                secretNumber = ThreadLocalRandom.current().nextInt(1, EASY_MAX + 1);
                playGame(secretNumber, sc, EASY_MAX);
            } else if (level == 2) {
                secretNumber = ThreadLocalRandom.current().nextInt(1, HARD_MAX + 1);
                playGame(secretNumber, sc, HARD_MAX);
            } else {
                System.out.println("\nInvalid level. Try again.");
                continue;
            }

            System.out.println("Do you want to continue the game(Y/N)");
            checking = sc.next();
            if (!checking.equalsIgnoreCase("y")) {
                System.out.println("Exiting...");
                sc.close();
                break;
            }
        }
    }

    private static void playGame(int secret, Scanner sc, int maxRange) {
        int attempts = 0;
        System.out.println("\nEnter your guess(1 - " + maxRange + ")");
        while (true) {
            int guess = sc.nextInt();
            attempts++;

            if (guess < 1 || guess > maxRange) {
                System.out.println("Out of range. Enter a number between 1 and " + maxRange + ":");
            } else if (guess == secret) {
                System.out.println("Correct! You got it in " + attempts + " attempt(s)!");
                break;
            } else {
                System.out.println(guess > secret ? "High, Try lower:" : "Low, Try higher:");
            }
        }

    }
}
