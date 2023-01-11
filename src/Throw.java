import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");

        int val = reader.nextInt();

        if (val <1 || val > 10){
            throw new RuntimeException(val + " is not in the range of 1 - 10. If you knew basic math you should be able to do this no problem but NOOOO");
        }
        System.out.println("Thank you you actually know how to do basic arithmetic unlike some people!");
    }
}

