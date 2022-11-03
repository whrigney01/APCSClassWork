package apcs.guess;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GuessRunner {
    public static void main(String[] args) {
        Value value = new Value();
        int guessNum = 1;
        System.out.println("Welcome to the number guessing game.  I have picked a random value between 1 and 100 for you to guess.  See if you can figure it out in fewer than 7 guesses!");
//        System.out.println("[Temporary print: The number is " + value + "]");
        System.out.println();
        Scanner reader = new Scanner(System.in);

        System.out.println("Do you want to guess or respond to computerized guesses?");
        System.out.print("1 for player guessing. 2 for computerized guesses: ");
        int playOption = reader.nextInt();

        boolean gameRunning = true;
        while (gameRunning) {
            if (playOption == 1) {
                System.out.print("Enter your Guess: ");
                try {
                    Value userGuess = new Value(reader.nextInt());
                    if (value.equals(userGuess)) {
                        System.out.println("You guessed correctly! You took " + guessNum + " guess(es) to find the number!");
                        gameRunning = false;
                        System.out.println("Thanks for Playing!");
                    } else if (!value.compare("greater", userGuess)) {
                        System.out.println("Your guess was too high. That's " + guessNum + " guess(es)");
                        guessNum++;
                    } else if (!value.compare("less", userGuess)) {
                        System.out.println("Your guess was too small. That's " + guessNum + " guess(es)");
                        guessNum++;
                    } else {
                        System.out.println("How did you even get this? You get a cookie. That's " + guessNum + " guess(es)");
                    }
                    System.out.println();

                } catch (Exception e) {
                    String error = reader.nextLine();
                    System.out.println("Sorry, that is not a whole number! Please try again. That's " + (guessNum - 1) + " guess(es)");
                    System.out.println();
                }
            }else if(playOption == 2){
                boolean isRoboGuessin = true;
                int lowLimit = 0;
                int highLimit = 100;
                System.out.print("Enter the number you would like the computer to guess: ");
                Value value1 = new Value(reader.nextInt());
                while(isRoboGuessin == true) {
                    Value roboGuess = new Value((int) (Math.random()*(highLimit - lowLimit) + (lowLimit + 1)));
                    System.out.println("Is " + roboGuess + " higher, lower or the same number as " + value1);
                    System.out.println("Higher (0)\nLower (1)\nSame (3)");
                    int closnes = reader.nextInt();
                    if(closnes == 3){
                        isRoboGuessin = false;
                        System.out.println("Robo Wins!");
                    }
                }
            }
        }
    }
}
