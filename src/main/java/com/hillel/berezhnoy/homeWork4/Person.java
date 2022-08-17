package main.java.com.hillel.berezhnoy.homeWork4;

public class Person {
    public static void main(String[] args) {
        String nameSmith = "Will", lastNameSmith = "Smith", citySmith = "New York", phoneSmith = "2936729462846";
        String nameChan = "Jackie", lastNameChan = "Chan", cityChan = "Shanghai", phoneChan = "12312412412";
        String nameHolmes = "Sherlock", lastNameHolmes = "Holmes", cityHolmes = "London", phoneHolmes = "37742123513";
        System.out.println(personInfo(nameSmith, lastNameSmith, citySmith, phoneSmith));
        System.out.println(personInfo(nameChan, lastNameChan, cityChan, phoneChan));
        System.out.println(personInfo(nameHolmes, lastNameHolmes, cityHolmes, phoneHolmes));
    }

    static String personInfo(String name, String lastName, String city, String phoneNumber) {
        return "Call a citizen " + name + " " + lastName + " " + "from the city " + city +
                " " + "can be number " + phoneNumber;
    }
}
