package main.java.com.hillel.berezhnoy.homeWork13;

import java.util.Locale;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        String drink;

        do {
            System.out.println("Choose a drink : Coffee, Tea, Lemonade,Mojito, Water, Cola");
            drink = scanner.next();
            DrinksMachine drinksMachine = DrinksMachine.valueOf(drink.toUpperCase(Locale.ROOT));

            System.out.println("How much you want to " + drinksMachine.getTitle());
            value = scanner.nextInt();
            switch (drinksMachine) {
                case COFFEE:
                    System.out.println(drinksMachine.getTitle() + " is prepared in " + value + " pieces.");
                    for (int i = 0; i < value; i++) {
                        new Drinks().CoffeCount();
                    }
                    break;
                case TEA:
                    System.out.println(drinksMachine.getTitle() + " is prepared in " + value + " pieces.");
                    for (int i = 0; i < value; i++) {
                        new Drinks().TeaCount();
                    }
                    break;
                case LEMONADE:
                    System.out.println(drinksMachine.getTitle() + " is prepared in " + value + " pieces.");
                    for (int i = 0; i < value; i++) {
                        new Drinks().LemonadeCount();
                    }
                    break;
                case MOJITO:
                    System.out.println(drinksMachine.getTitle() + " is prepared in " + value + " pieces.");
                    for (int i = 0; i < value; i++) {
                        new Drinks().MojitoCount();
                    }
                    break;
                case WATER:
                    System.out.println(drinksMachine.getTitle() + " is prepared in " + value + " pieces.");
                    for (int i = 0; i < value; i++) {
                        new Drinks().WaterCount();
                    }
                    break;
                case COLA:
                    System.out.println(drinksMachine.getTitle() + " is prepared in " + value + " pieces.");
                    for (int i = 0; i < value; i++) {
                        new Drinks().ColaCount();
                    }
                    break;
            }

            System.out.println("\nCan I get you anything else No/Yes");

            String cycle = scanner.next().toLowerCase();
            if (cycle.equals("no")) {
                break;
            }else if(cycle.equals("yes")){
                System.out.println("Continue shopping\n");
            }else{
                System.out.println("You typed incorrectly,try first");
                System.exit(0);
            }
        } while (true);
        scanner.close();
        new Drinks().Total();
    }
}
