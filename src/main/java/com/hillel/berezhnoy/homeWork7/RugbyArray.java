package main.java.com.hillel.berezhnoy.homeWork7;


import java.util.Arrays;

public class RugbyArray {
    public static void main(String[] args) {
        int numberOfGames = 25;
        int[] team1 = new int[numberOfGames];
        int[] team2 = new int[numberOfGames];
        System.out.println("The age of each player in the team \"Sirko\"");
        playingAge(team1);
        System.out.println("\n\nThe age of each player in the team \"Dnipro\"");
        playingAge(team2);
        System.out.println("\n\nThe average age of the team \"Sirko\": " + averageAge(team1));
        System.out.println("The average age of the team \"Dnipro\": " + averageAge(team2));

        //Task 2
        System.out.println("\n-------------------------------The second task-----------------------------");
        System.out.println("\n Option 1 ");
        int[] source = {1, 2, 3, 4};
        int[] target = {5, 6, 7};
        System.out.println(Arrays.toString(arrayCopy2(source, target)));
        System.out.println("\n Option 2 ");
        int[] source2 = {1, 2, 3, 4};
        int[] target2 = {};
        System.out.println(Arrays.toString(arrayCopy2(source2, target2)));
    }

    static void playingAge(int[] command) {
        int[] minMaxAge = {18, 23};
        for (int i = 0; i < command.length; i++) {
            command[i] = minMaxAge[0] + (int) (Math.random() * minMaxAge[1]);
            System.out.print(" player " + (i + 1) + "," + " age: " + command[i] + ". ");
        }
    }

    static double averageAge(int[] averAg) {
        int sum = 0;
        for (int j : averAg) {
            sum = sum + j;
        }
        return (double) sum / averAg.length;
    }

    //    Task 2
    static int[] arrayCopy2(int[] source, int[] target) {
        int i;
        int[] temporary = target;
        target = new int[target.length + source.length];
        for (i = 0; i < temporary.length; i++) {
            target[i] = temporary[i];
        }
        for (i = 0; i < source.length; i++) {
            target[i + target.length - source.length] = source[i];
        }
        return target;
    }
}
