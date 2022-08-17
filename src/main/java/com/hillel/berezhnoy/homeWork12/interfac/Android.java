package main.java.com.hillel.berezhnoy.homeWork12.interfac;

public class Android implements Smartphones, Linux {
    @Override
    public void call() {
        System.out.println("Call-android");
    }

    @Override
    public void sms() {
        System.out.println("SMS-android");
    }

    @Override
    public void internet() {
        System.out.println("Internet-android");
    }

    @Override
    public void googlePlay() {
        System.out.println("googlePlay");
    }
}
