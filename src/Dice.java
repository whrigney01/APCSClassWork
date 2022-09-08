import java.util.Scanner;
public class Dice {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        int sides;
        System.out.print("Enter a number of sides for the dice: ");
        sides = reader.nextInt();
        int die1 = (int) (Math.random() * (sides) + 1);
        int die2 = (int) (Math.random() * (sides) + 1);
        int x = 0;
        while (die1 != die2) {
            die1 = (int) (Math.random() * (sides) + 1);
            die2 = (int) (Math.random() * (sides) + 1);
            System.out.println("Die 1: " + die1 + ",  Die 2: " + die2 + ",  Total: " + (die1 + die2));
            x += 1;
        }
        System.out.println("Number of tries: " + x);





    }
}
