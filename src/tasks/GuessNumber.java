package tasks;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);





        // Generate random number 0 - max
        int rand = (int) (Math.random() * (+1)); // ģenerē max value
       System.out.println("Generate random number = " + rand);

        System.out.println("Random number between 0 and "  + " was generated");

        int guess;
        do {
            System.out.println("Guess the random number");
            guess = scanner.nextInt();

            if (guess > rand) {
                System.out.println("Try smaller");
            } else if (guess < rand) {
                System.out.println("Try bigger");
            }

        }while (guess != rand);

        System.out.println("Congratulations you won!");


    }
}
