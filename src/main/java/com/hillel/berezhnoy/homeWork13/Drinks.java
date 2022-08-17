package main.java.com.hillel.berezhnoy.homeWork13;

public class Drinks {
    final int coffee = 10;
    final int tea = 15;
    final int lemonade = 8;
    final int mojito = 12;
    final int water = 5;
    final int cola = 9;

    public static int coffeCount;
    public static int teaCount;
    public static int lemonadeCount;
    public static int mojitoCount;
    public static int waterCount;
    public static int colaCount;

    public void CoffeCount() {
        coffeCount += coffee;
    }

    public void TeaCount() {
        teaCount += tea;
    }

    public void LemonadeCount() {
        lemonadeCount += lemonade;
    }

    public void MojitoCount() {
        mojitoCount += mojito;
    }

    public void WaterCount() {
        waterCount += water;
    }

    public void ColaCount() {
        colaCount += cola;
    }

    public void Total() {
        if (coffeCount > coffee) {
            System.out.println("You order " + coffeCount / coffee +
                    " " + DrinksMachine.COFFEE.getTitle() + " for a total of " + coffeCount + " $");
        }
        if (teaCount > tea) {
            System.out.println("You order " + teaCount / tea +
                    " " + DrinksMachine.TEA.getTitle() + " for a total of " + teaCount + " $");
        }
        if (lemonadeCount > lemonade) {
            System.out.println("You order " + lemonadeCount / lemonade +
                    " " + DrinksMachine.LEMONADE.getTitle() + " for a total of " + lemonadeCount + " $");
        }
        if (mojitoCount > mojito) {
            System.out.println("You order " + mojitoCount / mojito +
                    " " + DrinksMachine.MOJITO.getTitle() + " for a total of " + mojitoCount + " $");
        }
        if (waterCount > water) {
            System.out.println("You order " + waterCount / water +
                    " " + DrinksMachine.WATER.getTitle() + " for a total of " + waterCount + " $");
        }
        if (colaCount > cola) {
            System.out.println("You order " + colaCount / cola +
                    " " + DrinksMachine.COLA.getTitle() + " for a total of " + colaCount + " $");
        }
        int total=coffeCount+teaCount+lemonadeCount+mojitoCount+waterCount+colaCount;
        System.out.println("Total amount of "+ total+" $");
    }
}

