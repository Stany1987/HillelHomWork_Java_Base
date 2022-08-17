package main.java.com.hillel.berezhnoy.homeWork3;

public class Task1LeeAndMinh {
    public static void main(String[] args) {

        int warriorLee = 13, archerLee = 24, horsemanLee = 46, warriorsLee = 860;
        int attackLee = 860 * (warriorLee + archerLee + horsemanLee);

        int warriorMinh = 9, archerMinh = 35, horsemanMinh = 12;
        int attackMinh = (int) ((warriorsLee * 1.5) * (warriorMinh + archerMinh + horsemanMinh));

        System.out.println("Army attack Lee\u2694: " + attackLee);
        System.out.println("Army attack Minh\u2694: " + attackMinh);


        //Task2SnowMan
        double snowDensity = 0.7;
        double firstBall = snowDensity * (4* Math.PI * Math.pow(1, 3))/3;
        double secondBall = snowDensity * (4 * Math.PI * Math.pow(0.5, 3)) / 3;
        double thirdBall = snowDensity * (4 * Math.PI * Math.pow(0.2, 3)) / 3;

        System.out.println("\nSnowman weighs: " + (firstBall + secondBall + thirdBall));


    }

}
