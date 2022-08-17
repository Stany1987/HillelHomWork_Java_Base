package main.java.com.hillel.berezhnoy.homeWork2;

public class ArithmeticOperations {
    public static void main(String[] args) {

        float lengthe = 8.11f, width = 6.19f, height = 16.15f;
        double length, volume = lengthe * width * height;
        length = 4 * (lengthe + width + height);
        System.out.println(" Parallelepiped volume = " + volume);
        System.out.println("length of all sides = " + length);

        float breadth = 48.514462f, longitude = 35.009381f;
        System.out.println("My location: \n" + "breadth " + breadth + "\n" + "longitude " + longitude);
    }
}
