import java.util.Scanner;
public class Dice {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        int sides;
        System.out.print("Enter a number of sides for the dice: ");
        sides = reader.nextInt();
        int die1 = (int) (Math.round(Math.random() * (sides -1) + 1));
        int die2 = (int) (Math.round(Math.random() * (sides -1) + 1));
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total: " + (die1 + die2));

    }
}
