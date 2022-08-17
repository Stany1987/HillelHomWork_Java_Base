package main.java.com.hillel.berezhnoy.homeWork8;

import java.util.Arrays;
import java.util.Scanner;

public class arrayLottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengArr = 7;
        int[] first = new int[lengArr];
        int[] second = new int[lengArr];
        System.out.println("Enter a number from 0 to 9");
        System.out.println(Arrays.toString(sorter(vereficationScan(scanner, second))));
        System.out.println(Arrays.toString(sorter(randomNumber(first))));
        eqals(first, second);
    }

    static int[] randomNumber(int[] first) {
        for (int i = 0; i < first.length; i++) {
            first[i] = (int) (Math.random() * 10);
        }
        return first;
    }

    static int[] vereficationScan(Scanner scanner, int[] second) {
        int i = 0;
        int minNumber = 0;
        int maxNumber = 9;
        int scan;
        while (true) {
            if (scanner.hasNextInt()) {
                for (; i < second.length; i++) {
                    scan = scanner.nextInt();
                    if (scan >= minNumber && scan <= maxNumber) {
                        second[i] = scan;
                    } else {
                        i--;
                        System.out.println("Enter a number from 0 to 9");
                    }
                }
                break;
            } else {
                System.out.println("The field can only accept numbers");
                scanner.next();
            }
        }
        return second;
    }

    static int[] sorter(int[] arraySort) {
        int temp;
        for (int i = 0; i < arraySort.length - 1; i++) {
            for (int j = 0; j < arraySort.length - 1 - i; j++)
                if (arraySort[j] > arraySort[j + 1]) {
                    temp = arraySort[j];
                    arraySort[j] = arraySort[j + 1];
                    arraySort[j + 1] = temp;
                }
        }
        return arraySort;
    }

    static void eqals(int[] arrayFirst, int[] arraySecond) {
        int i = 0;
        int count = 0;
//        System.out.print("Matched: ");
        for (; i < arrayFirst.length; i++) {
            if (arrayFirst[i] == arraySecond[i]) {
                count++;
//                System.out.print(i + 1+",");
            }
        }
        System.out.println(" elements\nNumber of hits: " + count );
    }
}
