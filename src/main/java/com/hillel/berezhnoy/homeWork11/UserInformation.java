package main.java.com.hillel.berezhnoy.homeWork11;

public class UserInformation {
    private final String name;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private final String userMail;
    private final String phoneUser;
    private String lastName;
    private double weight;
    private String pressure;
    private int steps;
    private final int age;

    public UserInformation(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, String userMail,
                           String phoneUser, String lastName, double weight, String pressure, int steps) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.userMail = userMail;
        this.phoneUser = phoneUser;
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        age = 2020 - yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getUserMail() {
        return userMail;
    }

    public String getPhoneUser() {
        return phoneUser;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getAge() {
        return age;
    }

    void printAccountInfo() {
        System.out.println("Name: " + name + "\nDate of birth: " + dayOfBirth + ". " + monthOfBirth +
                ". " + yearOfBirth + "\nE-mail: " + userMail + "\nNumber phone: " + phoneUser +
                "\nLast name: " + lastName + "\nWeight: " + weight + "\nPressure: " + pressure +
                "\nNumber of steps per day: " + steps + "\nAge: " + age);
        System.out.println();
    }

}
