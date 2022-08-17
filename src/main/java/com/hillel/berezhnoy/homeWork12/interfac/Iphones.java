package main.java.com.hillel.berezhnoy.homeWork12.interfac;

public class Iphones implements Smartphones, Ios {
    @Override
    public void call() {
        System.out.println("Call-iphones");
    }

    @Override
    public void sms() {
        System.out.println("SMS-iphones");
    }

    @Override
    public void internet() {
        System.out.println("Internet-iphones");
    }

    @Override
    public void appeleStore() {
        System.out.println("Apple Store-iphones");
    }
}
