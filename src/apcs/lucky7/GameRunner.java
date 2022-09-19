package apcs.lucky7;
import java.sql.SQLOutput;
import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        //Extension: I made the program have 2 games (Lucky 7 or chuck-o-luck) that you can play along with customizable options within the games like the winning value and sides of the die
        Scanner reader = new Scanner (System.in);
        double previousBalance = 0;
        double balance = 0.00;
        int timesPlayed= 0;
        double accountMax = 0;
        int maxRoll = 0;
        int winValue = 0;
        int dieSides = 0;
        String result = "";
        int winCounter = 0;
        System.out.print("Starting Account Balance: $");
        balance = reader.nextInt();
        System.out.print("How many sides should the die have: ");
        dieSides = reader.nextInt();
        System.out.println("Do you want to play Lucky-7 or Chuck-O-Luck");
        String game = reader.next();
        if (game.equals("Lucky-7")) {
            System.out.print("Winning Value: ");
            winValue = reader.nextInt();
            System.out.println("Your starting account balance is $" + balance);
            System.out.println("The winning value is " + winValue);
            while (balance > 0) {
                previousBalance = balance;
                balance--;
                int die1 = (int) (Math.random() * dieSides + 1);
                int die2 = (int) (Math.random() * dieSides + 1);
                if (die1 + die2 == winValue) {
                    balance += 5;
                    result = "WIN!";
                    winCounter++;
                } else {
                    result = "Lose!";
                }
                timesPlayed++;
                if (balance > accountMax) {
                    accountMax = balance;
                    maxRoll = timesPlayed;
                }
                System.out.println("Roll #" + timesPlayed + ": " + die1 + ", " + die2 + "   Total: " + (die1 + die2) + " = " + result + "  Starting Balance: $" + previousBalance + "0.  New Balance: $" + balance + "0.");
            }
            System.out.println("You should have stopped after " + maxRoll + " rolls when you balance was $" + accountMax + "0.");
            System.out.println("Your sum of the dice was " + winValue + " " + winCounter + " times in the game.");
        }
        if (game.equals("Chuck-O-Luck")) {
            System.out.print("What number do you want to bet on: ");
            winValue = reader.nextInt();
            while (balance > 0){
                previousBalance = balance;
                balance --;
                int die1 = (int) (Math.random() * dieSides + 1);
                int die2 = (int) (Math.random() * dieSides + 1);
                int die3 = (int) (Math.random() * dieSides + 1);
                if (die1 == winValue && die2 == winValue && die3 == winValue){
                    balance += 6;
                    result = "WIN! x3";
                    winCounter += 3;
                } else if (die1 == winValue && die2 == winValue || die1 == winValue && die3 == winValue || die2 == winValue && die3 == winValue){
                    balance += 3;
                    result = "WIN! x2";
                    winCounter += 2;
                } else if (die1 == winValue || die2 == winValue || die3 == winValue){
                    balance ++;
                    result = "WIN!";
                    winCounter++;
                } else {
                    result = "Lose!";
                }
                timesPlayed++;
                if (balance > accountMax){
                    accountMax = balance;
                    maxRoll = timesPlayed;
                }
              System.out.println("Roll #" + timesPlayed + ": " + die1 + ", " + die2 + ", " + die3 + ". " + result + ".  Starting Balance: $" + previousBalance + "0.  New Balance: $" + balance + "0.");
            }
            System.out.println("You should have stopped after " + maxRoll + " rolls when you balance was $" + accountMax + "0.");
            System.out.println("You rolled a " + winValue + " " + winCounter + " times in the game.");
        }
    }
}
