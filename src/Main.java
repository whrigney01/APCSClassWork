import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        int sum = 0;
        double average = 0;
        int numValues = 0;
        while(sum <= 100){
            System.out.print("Enter a whole number: ");
            int tempNum = reader.nextInt();
            sum += tempNum;
            numValues++;
        }
        System.out.println(((double)sum)/numValues);
    }
}
