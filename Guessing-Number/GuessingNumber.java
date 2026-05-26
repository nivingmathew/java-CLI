
//import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingNumber {

    public static void main(String[] args) {
        int secretNumber;
        String checking;
        

        System.out.println("-----Welcome to Number Guessing Game-----");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect the difficulty level\n1-Easy\n2-Hard");

            int level = sc.nextInt();

            if (level != 1 && level != 2) {
                System.out.println("\nWrong input");
                System.out.println("Do you want to continue(Y/N)");
                checking = sc.next();
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
            
            switch (level) {
                case 1:
                    secretNumber = ThreadLocalRandom.current().nextInt(1, 101);
                    easyGame(secretNumber, sc);
                    break;

                case 2:
                    secretNumber = ThreadLocalRandom.current().nextInt(1, 501);
                    hardGame(secretNumber, sc);
                    break;

                default:
                    break;
            }
            System.out.println("Do you want to continue the game(Y/N)");
            checking = sc.next();
            if(checking.equalsIgnoreCase("y")) {
                continue;
            } else {
                checking.equalsIgnoreCase("n");
                break;
            }
            
        }
    }

    public static void easyGame(int secretNumber, Scanner sc) {
        int value;
        System.out.println("\nEnter your guess(1 - 100): ");
        value = sc.nextInt();
        while (true) {
            if (value < 101 && value > 0) {
                if(secretNumber == value) {
                    System.out.println("Found the number");
                    break;
                } else {
                    if(value>secretNumber) {
                        System.out.println("Lower");
                    } else {
                        System.out.println("Higher");
                    }
                    System.out.println("Enter another guess");
                    value = sc.nextInt();
                }
            } else {
                System.out.println("Enter a valid number");
                value = sc.nextInt();
            }
        }
    }

    static void hardGame(int secretNumber, Scanner sc) {
        int value;
        System.out.println("\nEnter your guess(1 - 500): ");
        value = sc.nextInt();
        while (true) {
            if (value < 501 && value > 0) {
                if(secretNumber == value) {
                    System.out.println("Found the number");
                    break;
                } else {
                    if(value>secretNumber) {
                        System.out.println("Lower");
                    } else {
                        System.out.println("Higher");
                    }
                    System.out.println("Enter another guess");
                    value = sc.nextInt();
                }
            } else {
                System.out.println("Enter a valid number");
                value = sc.nextInt();
            }
        }
    }
}