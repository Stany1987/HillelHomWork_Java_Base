package main.java.com.hillel.berezhnoy.homeWork10;

public class Burger {
    String name;
    String bun;
   String meat;
    String cheese;
    String vegetables;
    String mayonnaise;


    public Burger(String name, String bun, String meat, String cheese, String vegetables, String mayonnaise) {
        this.name = name;
        this.bun = bun;
        this.meat =meat;
        this.cheese = cheese;
        this.vegetables = vegetables;
        this.mayonnaise = mayonnaise;
        System.out.println(name + ":\n " + bun + ", " + meat + ", " + cheese +
                ", " + vegetables + ", " + mayonnaise + ".\n");
    }

    public Burger(String name, String bun, String meat, String cheese, String vegetables) {
        this.name = name;
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.vegetables = vegetables;
        System.out.println(name + ":\n " + bun + ", " + meat + ", " + cheese + ", " + vegetables + ".\n");
    }

    public Burger(String name, String bun, boolean doublMeat, String cheese
            , String vegetables, String mayonnaise) {
        this.name = name;
        this.bun = bun;
        this.cheese = cheese;
        this.vegetables = vegetables;
        this.mayonnaise = mayonnaise;
        System.out.println(name + ":\n " + bun + ", "  + meat + ", " + cheese +
                ", " + vegetables + ", " + mayonnaise + ".");
    }


}
