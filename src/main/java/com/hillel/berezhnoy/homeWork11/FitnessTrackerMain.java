package main.java.com.hillel.berezhnoy.homeWork11;

public class FitnessTrackerMain {
    public static void main(String[] args) {

        UserInformation userOne = new UserInformation("Stan", 10, 11,
                2001, "imstany@gmail.com", "80931111111",
                "Marsh", 93.20, "120x80", 6000);

        UserInformation userSecond = new UserInformation("Vika", 19, 1,
                2001, "viky@gmail.com", "80956781234",
                "Bulba", 47, "120x60", 4000);

        UserInformation userThird = new UserInformation("Sergei", 15, 3,
                2005, "pazia@mail.ru", "8056211789", "Papazodlo",
                135.7, "140x90", 3000);

        userOne.printAccountInfo();

        userSecond.printAccountInfo();
        userSecond.setLastName("Barakuda");
        userSecond.setPressure("120x70");
        userSecond.setWeight(46.2);
        userSecond.setSteps(5000);
        userSecond.printAccountInfo();

        userThird.printAccountInfo();
        userThird.setWeight(155.7);
        userThird.setLastName("Malvina");
        userThird.setSteps(200);
        userThird.printAccountInfo();

    }
}
