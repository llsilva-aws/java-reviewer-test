import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*100 + 1);
        System.out.println("A random number has been generated...");
        Scanner scanner = new Scanner(System.in);

        // Guess 1
        int userAnswer = -1;
        for(int i = 0; i < 3; i++) {
            System.out.println("Enter a guess between 1 and 100");
            userAnswer = scanner.nextInt();
            checkAnswer(userAnswer, computerNumber);
        }

        System.out.println("Sorry for your luck, restart the program to play again!");
    }

    private static void checkAnswer(int userAnswer, int computerNumber){

        if (userAnswer <=0 || userAnswer >100) {
            System.out.println("Invalid response");
        }
        else if (userAnswer == computerNumber ){
            System.out.println("Correct! You win! See you next time!");
            System.exit(0);
        }
        else if (userAnswer > computerNumber) {
            System.out.println("Your guess is too high, guess again.");
        }
        else if (userAnswer < computerNumber) {
            System.out.println("Your guess is too low, guess again.");
        }
        else {
            System.out.println("Your guess is incorrect");
        }

    } 
}