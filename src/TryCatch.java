import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean tryAgain = true;
        while(tryAgain) {
            System.out.print("Enter an Integer: ");
            try {
                int x = reader.nextInt();
                if (100 / x > 5) System.out.println("Success");
                else System.out.println("Failure");
                tryAgain = false;
            } catch (ArithmeticException e) {
                System.out.println("You can't divide by 0 you math deprived monkey. Try Again!");
            } catch (InputMismatchException e){
                String error = reader.nextLine();
                System.out.println(error +  " is not not an integer!");
            }
        }
    }
}