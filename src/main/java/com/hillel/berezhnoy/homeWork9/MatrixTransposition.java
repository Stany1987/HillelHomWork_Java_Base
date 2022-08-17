package main.java.com.hillel.berezhnoy.homeWork9;

import java.util.Scanner;

public class MatrixTransposition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int line = 0;
        int column = 0;
        line = verefication(scanner, line);
        column = verefication(scanner, column);
        int num = 1;
        int[][] arrayFirst = new int[line][column];
        for (int i = 0; i < arrayFirst.length; i++) {
            for (int j = 0; j < arrayFirst[i].length; j++) {
                arrayFirst[i][j] = num++;
                System.out.print(arrayFirst[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        int[][] arrayTwo = new int[column][line];
        for (int i = 0; i < arrayFirst.length; i++) {
            for (int j = 0; j < arrayFirst[i].length; j++) {
                arrayTwo[j][i] = arrayFirst[i][j];
            }
        }
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[i].length; j++) {
                System.out.print(arrayTwo[i][j] + " \t");
            }
            System.out.println();
        }
    }

    static int verefication(Scanner scanner, int scan) {
        while (true) {
            if (scanner.hasNextInt()) {
                scan = scanner.nextInt();
                    System.out.println("Enter the number of columns");
                break;
            } else {
                System.out.println("The field can only accept numbers");
                scanner.next();
            }
        }
        return scan;
    }
}
