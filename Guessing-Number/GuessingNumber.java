
//import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingNumber {

    public static void main(String[] args) {
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);

        System.out.println("-----Welcome to Number Guessing Game-----");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect the difficulty level\n1-Easy\n2-Hard");

            int level = sc.nextInt();

            if (level != 1 && level != 2) {
                System.out.println("\nWrong input");
                System.out.println("Do you want to continue(Y/N)");
                String checking = sc.next();
                if (checking.equalsIgnoreCase("y")) {
                    continue;
                } else if (checking.equalsIgnoreCase("n")) {
                    System.out.println("\n-----See you later-----");
                    break;
                } else {
                    System.out.println("\nWrong Input Again\nBe serious. BYE");
                    break;
                }
            }
        }
    }

}