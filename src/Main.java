import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int randomNumber = generator.nextInt(10) + 1;
        int userGuess = 0; // Initialize userGuess
        boolean validInput = false;

        // Loop for inputting user's guess
        do {
            System.out.print("Guess the number (between 1 and 10): ");
            if (in.hasNextInt()) {
                userGuess = in.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next(); // Clear the invalid input
            }
        } while (!validInput);

        // Display the random number
        System.out.println("The random number is: " + randomNumber);

        // Check if the user's guess is high, low, or right
        if (userGuess > randomNumber) {
            System.out.println("Your guess is too high!");
        } else if (userGuess < randomNumber) {
            System.out.println("Your guess is too low!");
        } else {
            System.out.println("Congratulations! Your guess is correct!");
        }

        in.close();
    }
}

