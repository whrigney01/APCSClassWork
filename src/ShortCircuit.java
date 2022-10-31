import java.util.Scanner;

public class ShortCircuit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int x = reader.nextInt();
        if (x != 0 && 100/x > 5) System.out.println("Success");
        else System.out.println("Failure");
    }
}
