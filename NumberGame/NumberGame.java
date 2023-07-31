package NumberGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        int score = 0;

        System.out.println("\n Welcome " + name + " in the Number Guessing Game");

        boolean tryAgain = true;
        while (tryAgain) {
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean correctGuess = false;

            System.out.println("\nA number between 1 and 100 is generated. Can you guess it?");

            while (!correctGuess) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + "in " + attempts + " attempts.");
                    score++;
                    correctGuess = true;
                } else if (guess < randomNumber) {
                    System.out.println("Guess value is low! Try again.");
                } else {
                    System.out.println("Guess value is high! Try again.");
                }

                if (!correctGuess && attempts == 5) {
                    System.out.println("Sorry, you have reached the maximum number of attempts.");
                    System.out.println("The correct number was: " + randomNumber);
                    break;
                }
            }

            System.out.print("\nDo you want to play again? (y/n): ");
            String playAgainInput = sc.next();
            tryAgain = playAgainInput.equalsIgnoreCase("y");
        }

        System.out.println("\nGame over! " + name + " your final score is: " + score);
    }
}


