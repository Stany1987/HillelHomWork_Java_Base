package main.java.com.hillel.berezhnoy.homeWork13;

public enum DrinksMachine {
    COFFEE("Coffee"),
    TEA("Tea"),
    LEMONADE("Lemonade"),
    MOJITO("Mojito"),
    WATER("Water"),
    COLA("Cola");
    private String title;
    DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
