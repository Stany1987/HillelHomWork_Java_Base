package main.java.com.hillel.berezhnoy.homeWork9;

import java.util.Scanner;

public class ticTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player one X \nPlayer two O");
        char[][] numberBoard = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        int number;
        int minBoard = 0;
        int maxBoard = 0;
        char x = 'x';
        char o = 'O';
        System.out.println("Now goes the first player X");
        for (int k = 0; k < 24; k++) {
            if ((numberBoard[0][0] == x) && (numberBoard[0][1] == x) && (numberBoard[0][2] == x) ||
                    (numberBoard[1][0] == x) && (numberBoard[1][1] == x) && (numberBoard[1][2] == x) ||
                    (numberBoard[2][0] == x) && (numberBoard[2][1] == x) && (numberBoard[2][2] == x) ||
                    (numberBoard[0][0] == x) && (numberBoard[1][0] == x) && (numberBoard[2][0] == x) ||
                    (numberBoard[0][1] == x) && (numberBoard[1][1] == x) && (numberBoard[2][1] == x) ||
                    (numberBoard[0][2] == x) && (numberBoard[1][2] == x) && (numberBoard[2][2] == x) ||
                    (numberBoard[0][0] == x) && (numberBoard[1][1] == x) && (numberBoard[2][2] == x) ||
                    (numberBoard[0][2] == x) && (numberBoard[1][1] == x) && (numberBoard[2][0] == x)) {
                System.out.println("Won the first player X ");
                System.exit(0);
            } else if ((numberBoard[0][0] == o) && (numberBoard[0][1] == o) && (numberBoard[0][2] == o) ||
                    (numberBoard[1][0] == o) && (numberBoard[1][1] == o) && (numberBoard[1][2] == o) ||
                    (numberBoard[2][0] == o) && (numberBoard[2][1] == o) && (numberBoard[2][2] == o) ||
                    (numberBoard[0][0] == o) && (numberBoard[1][0] == o) && (numberBoard[2][0] == o) ||
                    (numberBoard[0][1] == o) && (numberBoard[1][1] == o) && (numberBoard[2][1] == o) ||
                    (numberBoard[0][2] == o) && (numberBoard[1][2] == o) && (numberBoard[2][2] == o) ||
                    (numberBoard[0][0] == o) && (numberBoard[1][1] == o) && (numberBoard[2][2] == o) ||
                    (numberBoard[0][2] == o) && (numberBoard[1][1] == o) && (numberBoard[2][0] == o)) {
                System.out.println("Won the second player O ");
                break;
            }


            for (int i = 0; i < numberBoard.length; i++) {
                for (int j = 0; j < numberBoard[i].length; j++) {
                    System.out.print(numberBoard[i][j] + " \t");
                }
                System.out.println();
            }
            number = vereficationScan(scanner);
            switch (number) {
                case 1:
                    minBoard = 0;
                    maxBoard = 0;
                    break;
                case 2:
                    minBoard = 0;
                    maxBoard = 1;
                    break;
                case 3:
                    minBoard = 0;
                    maxBoard = 2;
                    break;
                case 4:
                    minBoard = 1;
                    maxBoard = 0;
                    break;
                case 5:
                    minBoard = 1;
                    maxBoard = 1;
                    break;
                case 6:
                    minBoard = 1;
                    maxBoard = 2;
                    break;
                case 7:
                    minBoard = 2;
                    maxBoard = 0;
                    break;
                case 8:
                    minBoard = 2;
                    maxBoard = 1;
                    break;
                case 9:
                    minBoard = 2;
                    maxBoard = 2;
                    break;
            }
            if (k % 2 == 0) {
                numberBoard[minBoard][maxBoard] = x;
                System.out.println("Now goes the second player O");
            } else {
                numberBoard[minBoard][maxBoard] = o;
                System.out.println("Now goes the first player X");
            }
        }
    }

    static int vereficationScan(Scanner scanner) {
        int number = 0;
        int scan;
        while (true) {
            if ((scanner.hasNextInt())) {
                scan = scanner.nextInt();
                if (scan > 0 && scan < 10) {
                    number = scan;
                } else {
                    System.out.println("Enter a number from 1 to 9");
                }
                break;
            } else {
                System.out.println("The field can only accept numbers");
                scanner.next();
            }
        }
        return number;
    }
}