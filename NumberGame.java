package codsoft;
import java.util.*;
public class NumberGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 Random random = new Random();
		 int score = 0;
		 String playAgain;
		 do {
		 int number = random.nextInt(100) + 1;
		 int guess;
		 int attempts = 0;
		 int maxAttempts = 5;
		 System.out.println("Guess the number between 1 and 100. You have " + maxAttempts );
		 do {
		 System.out.print("Enter your guess: ");
		 guess = scanner.nextInt();
		 attempts++;
		 if (guess == number) {
		 System.out.println("Correct! You've guessed the number.");
		 score++;
		 break;
		 } else if (guess < number) {
		 System.out.println("Too low.");
		 } else {
		 System.out.println("Too high.");
		 }
		 } while (attempts < maxAttempts);
		 if (guess != number) {
		 System.out.println("Out of attempts! The number was: " + number);
		 }
		 System.out.print("Play again? (yes/no): ");
		 playAgain = scanner.next();
		 } 
		 while (playAgain.equalsIgnoreCase("yes"));
		 System.out.println("Your score: " + score);
	}
}


	


