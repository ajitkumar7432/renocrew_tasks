import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        
        int min = 1;
        int max = 100;
        
        
        int targetNumber = random.nextInt(max - min + 1) + min;
        int guess = 0;
        int numberOfTries = 0;
        
        System.out.println("Guess the number between " + min + " and " + max + ":");
        
        
        while (guess != targetNumber) {
            numberOfTries++;
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            
            if (guess < targetNumber) {
                System.out.println("Too low. Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
            }
        }
        
        scanner.close();
    }
}
