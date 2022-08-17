package main.java.com.hillel.berezhnoy.homeWork12.polimorf;

import java.util.Arrays;

public class MainMusic {
    public static void main(String[] args) {

        RockMusic rockMusic = new RockMusic();
        PopMusic popMusic = new PopMusic();
        ClassicMusic classicMusic = new ClassicMusic();
        String[] rockGroup = {"Merlin Menson", "Metallica", "AC/DC"};
        String[] popGroup = {"InstaSamka", " Morgenstern"};
        String[] classicGroup = {"Mozart", "Bah"};

        MusicStyles[] musicStyles = {rockMusic, popMusic, classicMusic};
        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();
            if (musicStyle == rockMusic) {
                System.out.println(Arrays.toString(rockGroup));
            } else if (musicStyle == popMusic) {
                System.out.println(Arrays.toString(popGroup));
            } else if (musicStyle == classicMusic) {
                System.out.println(Arrays.toString(classicGroup));
            }
        }
    }
}
