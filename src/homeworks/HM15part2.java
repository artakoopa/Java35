package homeworks;

import java.util.Scanner;

public class HM15part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player1: ROCK, PAPER, SCISSORS, LIZARD, SPOCK - which one you choose?");
        String player1 = scanner.nextLine().toLowerCase().trim().replaceAll(" ", "");

        if (player1.matches("rock|paper|scissors|spock|lizard")) {
            System.out.println("Player2: ROCK, PAPER, SCISSORS, SPOCK, LIZARD - which one you choose?");
            String player2 = scanner.nextLine().toLowerCase().trim().replaceAll(" ", "");

            if (player2.matches("rock|paper|scissors|spock|lizard")) {
                System.out.println(rockPaperScissors(player1, player2));
            } else {
                System.out.println("Your input is invalid");
            }

        } else {
            System.out.println("Your input is invalid");
        }

    }

    public static String rockPaperScissors(String player1, String player2) {
        String winner;
        if (player1.equals(player2)) {
            winner = "TIE";
        } else if (player1.equals("rock") && player2.matches("scissors|lizard")
                || player1.equals("scissors") && player2.matches("paper|lizard")
                || player1.equals("paper") && player2.matches("rock|spock")
                || player1.equals("lizard") && player2.matches("paper|spock")
                || player1.equals("spock") && player2.matches("scissors|rock")) {
            winner = "Player 1 wins";
        } else {
            winner = "Player 2 wins";
        }
        return winner;
    }

}
