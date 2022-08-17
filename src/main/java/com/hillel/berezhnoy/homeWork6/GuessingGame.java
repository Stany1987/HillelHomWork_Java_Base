package main.java.com.hillel.berezhnoy.homeWork6;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int min = 0;
        int max = 11;
        Scanner scan = new Scanner(System.in);
        System.out.print("Guess the number from 0 to 10: ");
        int numberRandom = (int) (min + (Math.random() * max));

        for (int i = 3; i > 0; i--) {
            int enterNumber = verification(scan);
            if (enterNumber == numberRandom) {
                System.out.println("Congratulations, you win!");
                System.exit(0);
            } else if (enterNumber < numberRandom) {
                if (i > 1) {
                    System.out.print("Try entering more number. " + "Only " + (i - 1) + " attempts left: ");
                }
            } else {
                if (i > 1) {
                    System.out.print("Try entering a smaller number. " + "Only " + (i - 1) + " attempts left: ");
                }
            }
        }
        System.out.println("You lost. Try again");
    }

    static int verification(Scanner scan) {
        int scanNumber = 0;
        while (true) {
            if (scan.hasNextInt()) {
                scanNumber = scan.nextInt();
                break;
            } else {
                System.out.print("The field can only take numbers, try again!: ");
                scan.next();
            }
        }
        return scanNumber;
    }
}