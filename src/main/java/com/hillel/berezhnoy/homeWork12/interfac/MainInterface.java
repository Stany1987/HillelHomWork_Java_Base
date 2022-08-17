package main.java.com.hillel.berezhnoy.homeWork12.interfac;

public class MainInterface {
    public static void main(String[] args) {
        Android android = new Android();
        System.out.println("Android: ");
        android.call();
        android.sms();
        android.internet();
        android.googlePlay();
        System.out.println("\nApple: ");
        Iphones iphones = new Iphones();
        iphones.call();
        iphones.sms();
        iphones.internet();
        iphones.appeleStore();

    }
}
