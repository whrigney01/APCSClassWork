package apcs.lucky7;
import java.sql.SQLOutput;
import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        double previousBalance = 0;
        double balance = 0.00;
        int timesPlayed= 0;
        double accountMax = 0;
        int maxRoll = 0;
        int winValue = 0;
        int dieSides = 0;
        String result;
        System.out.print("Starting Account Balance: $");
        balance = reader.nextInt();
        System.out.print("Winning Value: ");
        winValue = reader.nextInt();
        System.out.print("Number of Sides on Die: ");
        dieSides = reader.nextInt();
        System.out.println("Your starting account balance is $" + balance);
        System.out.println("The winning value is " + winValue);
        System.out.println("The number of sides on the die is " + dieSides);
        System.out.println("Are you ready to gamble away your life savings? Yes/No");
        String yesNo = reader.nextStr();
        if (yesNo.equals("Yes")) {
            while (balance > 0) {
                previousBalance = balance;
                balance--;
                int die1 = (int) (Math.random() * 6 + 1);
                int die2 = (int) (Math.random() * 6 + 1);
                if (die1 + die2 == 7) {
                    balance += 5;
                    result = "WIN!";
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
        }
        System.out.println("You should have stopped after " +maxRoll + " rolls when you balance was $" + accountMax + "0.");
    }
}
