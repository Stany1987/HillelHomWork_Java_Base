package main.java.com.hillel.berezhnoy.homeWork6;

public class ShuttleNumber {
    public static void main(String[] args) {
        int shuttle = 1;
        int shuttle2 = 1;
        while (shuttle < 100) {
            if (goodNumber(shuttle2)) {
                System.out.println("Shuttle number: " + shuttle2);
                shuttle++;
            }
            shuttle2++;
        }
    }

    static boolean goodNumber(int shuttle) {
        int numberShuttle = shuttle % 10;
        for (; shuttle > 0; shuttle--) {
            if ((numberShuttle == 4) || (numberShuttle == 9)) {
                return false;
            }
            shuttle = shuttle / 10;
            numberShuttle = shuttle % 10;
        }
        return true;
    }
}
