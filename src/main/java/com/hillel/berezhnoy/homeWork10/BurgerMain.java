package main.java.com.hillel.berezhnoy.homeWork10;

public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger("Regular burger", "Bun", false, "Cheese"
                , "Vegetables", "Mayonnaise");
        Burger dietBurger = new Burger("Diet burger", "Bun", "Meat", "Cheese"
                , "Vegetables");
        Burger doubleMeatBurger = new Burger("Burger with double meat","Bun",true
                ,"Cheese","Vegetables","Mayonnaise");
    }
}
