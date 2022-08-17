package main.java.com.hillel.berezhnoy.homeWork4;

public class HM4Zoo {
    public static void main(String[] args) {
        int min = 2;
        int max = 29;
        int bears, tigers, parrots, elephants, racoons, ferret;

        bears = min + (int) (Math.random() * max);
        tigers = min + (int) (Math.random() * max);
        parrots = min + (int) (Math.random() * max);
        elephants = min + (int) (Math.random() * max);
        racoons = min + (int) (Math.random() * max);
        ferret = min + (int) (Math.random() * max);

        int animals = countAnimals(bears, tigers, parrots, elephants, racoons);
        int animalsNextYear = countAnimalsNextYear(bears, tigers, parrots, elephants, racoons, animals);
        int ferretNextYear = ferretCountNextYear(ferret);
        System.out.println("Beasts this year: " + countAnimals(bears, tigers, parrots, elephants, racoons));
        System.out.println("There’ll be beasts next year: " + animalsNextYear);
        System.out.println("Ferret this year: " + ferret);
        System.out.println("Ferret next year: " + ferretNextYear);
    }

    static int countAnimals(int bears, int tigers, int parrots, int elephants, int racoons) {
        return bears + tigers + parrots + elephants + racoons;
    }

    static int countAnimalsNextYear(int bears, int tigers, int parrots, int elephants, int racoons, int animals) {
        double growthRateBeers = 0.3;
        double growthRateTigers = 0.2;
        double growthRateParrots = 0.4;
        double growthRateElephants = 0.05;
        double growthRateRacoons = 0.8;
        double coff = ((bears * growthRateBeers) + (tigers * growthRateTigers) + (parrots * growthRateParrots) +
                (elephants * growthRateElephants) + (racoons * growthRateRacoons));
        return (int) (animals + coff);
    }

    static int ferretCountNextYear(int ferret) {
        double growthRateFerret = 0.7;
        double cofff = ferret * growthRateFerret;
        return (int) cofff + ferret;
    }

}
