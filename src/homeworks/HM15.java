package homeworks;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

public class HM15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player1: ROCK, PAPER, SCISSORS - which one you choose?");
        String player1 = scanner.nextLine().toLowerCase().trim().replaceAll(" ", "");

        String [] words = {"rock", "paper", "scissors"};
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String player2 = words [randomIndex];
        System.out.println("Computer: " + player2);

        //if (player1.matches("rock|paper|scissors")) {
           // System.out.println("Player2: ROCK, PAPER, SCISSORS - which one you choose?");
            //String player2 = scanner.nextLine().toLowerCase().trim().replaceAll(" ", "");

            //if (player2.matches("rock|paper|scissors")) {
               System.out.println(rockPaperScissors(player1, player2));
           // } else {
                //System.out.println("Your input is invalid");
           // }

       // } else {
       // System.out.println("Your input is invalid");
       // }

    }

    public static String rockPaperScissors(String player1, String player2) {
        String winner;
        //Validating input
        if (!checkInputValid(player1,player2)){
            //Stop the method and return "Invalid input"
            return "Inuput values are not valid";
        }

        if (player1.equals(player2)) {
            winner = "TIE";
        } else if (player1.equals("rock") && player2.equals("scissors")
                || player1.equals("scissors") && player2.equals("paper")
                || player1.equals("paper") && player2.equals("rock")) {
            winner = "Player 1 wins";
        } else {
            winner = "Player 2 wins";
        }
        return winner;
        }

        private static boolean checkInputValid(String player1, String player2){
            return player1.matches("rock|paper|scissors") && player2.matches("rock|paper|scissors");

        }

}
