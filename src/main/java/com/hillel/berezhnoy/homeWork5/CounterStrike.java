package main.java.com.hillel.berezhnoy.homeWork5;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of the first command: ");
        String nameFirstCommand = scan.next();
        System.out.println("Enter the number of wins for each of the five first team players: ");
        int accountKill = 0;
        System.out.print("Player 1: ");
        int firstTeamPlayer1 = numberFrags(accountKill, scan);
        System.out.print("Player 2: ");
        int firstTeamPlayer2 = numberFrags(accountKill, scan);
        System.out.print("Player 3: ");
        int firstTeamPlayer3 = numberFrags(accountKill, scan);
        System.out.print("Player 4: ");
        int firstTeamPlayer4 = numberFrags(accountKill, scan);
        System.out.print("Player 5: ");
        int firstTeamPlayer5 = numberFrags(accountKill, scan);

        System.out.print("Enter the name of the second command: ");
        String nameSecondCommand = scan.next();
        System.out.println("Enter the number of wins for each of the five players in the second team: ");
        System.out.print("Player 1: ");
        int secondTeamPlayer1 = numberFrags(accountKill, scan);
        System.out.print("Player 2: ");
        int secondTeamPlayer2 = numberFrags(accountKill, scan);
        System.out.print("Player 3: ");
        int secondTeamPlayer3 = numberFrags(accountKill, scan);
        System.out.print("Player 4: ");
        int secondTeamPlayer4 = numberFrags(accountKill, scan);
        System.out.print("Player 5: ");
        int secondTeamPlayer5 = numberFrags(accountKill, scan);
        scan.close();

        double team1 = arithmeticMean(firstTeamPlayer1, firstTeamPlayer2, firstTeamPlayer3,
                firstTeamPlayer4, firstTeamPlayer5);
        double team2 = arithmeticMean(secondTeamPlayer1, secondTeamPlayer2, secondTeamPlayer3,
                secondTeamPlayer4, secondTeamPlayer5);

        if (team1 > team2) {
            System.out.print("Wins command " + nameFirstCommand + " scored " + team1 + " points");
        } else if (team1 < team2) {
            System.out.print("Wins command " + nameSecondCommand + " scored " + team2 + " points");
        } else {
            System.out.println("Draw, friendship won ");
        }
    }

    public static int numberFrags(int accountKill, Scanner scan) {
        if (scan.hasNextInt()) {
            accountKill = scan.nextInt();
        } else {
            System.out.println("The field can only accept numbers");
            scan.next();
        }
        return accountKill;
    }

    public static double arithmeticMean(int player1, int player2, int player3, int player4, int player5) {
        return (double) (player1 + player2 + player3 + player4 + player5) / 5;
    }
}
