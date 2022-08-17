package com.hillel.berezhnoy.lesson14;

public class ArrayUtils {

    public static double getAverega(int[][] array) {

        double sum = 0;
        int k = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                k++;
            }
        }
        return sum / k;
    }

    public static boolean isSquare(int[][] array){
        for (int i = 0; i < array.length; i++) {
            if(array.length != array[i].length){
                return false;
            }
        }
        return true;
    }
}
