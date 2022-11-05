package apcs.guess;

import java.util.Scanner;

public class GuessRunner {
    public static void main(String[] args) {
        Value value = new Value();
        int guessNum = 0;
        int lowLimit = 0;
        int highLimit = 100;
        int roboGuessNum = 0;
        System.out.println("Welcome to the number guessing game. There are 3 modes where the goal in all of them is to guess a number between 1 and 100 in less than 7 tries.\nThe modes are guessing yourself to figure out the number, responding to a robot trying to guess the number, and a competition mode where you compete with the robot to see who can guess the number quicker. ");

//        System.out.println("[Temporary print: The number is " + value + "]");
        System.out.println();
        Scanner reader = new Scanner(System.in);

        System.out.println("Do you want to guess or respond to computerized guesses?");
        System.out.println("You Guess (0)\nComputer Guesses (1)\nCompete against computer (2)");
        int playOption = reader.nextInt();

        boolean gameRunning = true;
        while (gameRunning) {
            if (playOption == 0) {
                System.out.print("Enter your Guess: ");
                try {
                    Value userGuess = new Value(reader.nextInt());
                    if (value.equals(userGuess)) {
                        System.out.println("You guessed correctly! You took " + guessNum + " guess(es) to find the number!");
                        gameRunning = false;
                        System.out.println("Thanks for Playing!");
                    } else if (!value.compare("greater", userGuess)) {
                        guessNum++;
                        System.out.println("Your guess was too high. That's " + guessNum + " guess(es)");
                    } else if (!value.compare("less", userGuess)) {
                        guessNum++;
                        System.out.println("Your guess was too small. That's " + guessNum + " guess(es)");
                    } else {
                        System.out.println("How did you even get this? You get a cookie. That's " + guessNum + " guess(es)");
                    }
                    System.out.println();

                } catch (Exception e) {
                    String error = reader.nextLine();
                    System.out.println("Sorry, that is not a whole number! Please try again. That's " + guessNum  + " guess(es)");
                    System.out.println();
                }
            }else if(playOption == 1){
                boolean isRoboGuessin = true;
                System.out.print("Enter the number you would like the computer to guess: ");
                Value value1 = new Value(reader.nextInt());
                while(isRoboGuessin) {
                    Value roboGuess = new Value((int) (Math.random()*(highLimit - lowLimit) + (lowLimit + 1)));
                    guessNum++;
                    System.out.println("\nIs " + roboGuess + " higher, lower or the same number as " + value1 + ". The robot has guessed " + guessNum + " times.");
                    System.out.println("Higher (0)\nLower (1)\nSame (2)");
                    int closnes = reader.nextInt();
                    if(closnes == 2 && roboGuess.getValue() == value1.getValue()) {
                        isRoboGuessin = false;
                        gameRunning = false;
                        System.out.println("Robo Wins and guesses the number in " + guessNum + " guess(es)! See if you can beat the robot by playing against it in the competition mode. ");
                    }else if(closnes == 1 && roboGuess.getValue() < value1.getValue()){
                        lowLimit = roboGuess.getValue();
                    }else if(closnes == 0 && roboGuess.getValue() > value1.getValue()){
                        highLimit = roboGuess.getValue();
                    }else if (closnes != 0 && closnes != 1 && closnes != 2){
                        System.out.println("\nPlease enter a number that corresponds to one of the actions.");
                    }else{
                        System.out.println("\nStop trying to cheat you monkey bozo");
                    }
                }
            }else if(playOption == 2){
                boolean gueesingInProg = true;
                boolean playerWin = false;
                boolean roboWin = false;
                while (gueesingInProg) {
                    System.out.print("\nEnter your Guess: ");
                    Value userGuess = new Value(reader.nextInt());
                    Value roboGuess = new Value((int) (Math.random() * (highLimit - lowLimit) + (lowLimit + 1)));
                    try {
                        if (value.equals(userGuess)) {
                            System.out.println("You guessed correctly! You took " + guessNum + " guess(es) to find the number!");
                            gameRunning = false;
                            playerWin = true;
                            gueesingInProg = false;

                        } else if (!value.compare("greater", userGuess)) {
                            guessNum++;
                            System.out.println("Your guess was too high. That's " + guessNum + " guess(es)");
                        } else if (!value.compare("less", userGuess)) {
                            guessNum++;
                            System.out.println("Your guess was too small. That's " + guessNum + " guess(es)");
                        } else {
                            System.out.println("How did you even get this? You get a cookie. That's " + guessNum + " guess(es)");
                        }


                        if (value.equals(roboGuess)) {
                            roboGuessNum++;
                            System.out.println("The robot guessed correctly! It took it " + roboGuessNum + " guess(es) to find the number!");
                            gameRunning = false;
                            gueesingInProg = false;
                            roboWin = true;
                        } else if (!value.compare("greater", roboGuess)) {
                            roboGuessNum++;
                            System.out.println("The robots guess was too high. That's " + roboGuessNum + " guess(es)");
                        } else if (!value.compare("less", roboGuess)) {
                            roboGuessNum++;
                            System.out.println("The robots guess was too small. That's " + roboGuessNum + " guess(es)");
                        } else {
                            System.out.println("How did you even get this? You get a cookie. That's " + roboGuessNum + " guess(es)");
                        }

                    } catch (Exception e) {
                        String error = reader.nextLine();
                        System.out.println("Sorry, that is not a whole number! Please try again. That's " + guessNum + " guess(es)");
                        System.out.println();
                    }
                    System.out.println("\n");

                    if (roboWin && playerWin){
                        System.out.println("You and the Robot tied with " + guessNum + " guess(es)! Good job!");
                        System.out.println("Thanks for Playing!");
                    }else if (roboWin && !playerWin){
                        System.out.println("The Robot won with " + roboGuessNum + " guess(es)! Better luck next time!");
                        System.out.println("Thanks for Playing!");
                    }else if(!roboWin && playerWin){
                        System.out.println("You beat the Robot and won with " + guessNum + " guess(es)! Good job beating a random number generator!");
                        System.out.println("Thanks for Playing!");
                    }
                }
            }else{
                System.out.println("\nPlease enter a number that corresponds to one of the actions.");
            }

        }
    }
}
