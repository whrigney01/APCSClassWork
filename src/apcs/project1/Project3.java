package apcs.project1;
import java.util.Scanner;


public class Project3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println("Kilometers to Nautical Miles Calculator");
        System.out.print("Kilometers: ");
        double km = reader.nextInt ();
        double nauticalMiles = (km / 10000) * (60*90);
        System.out.println("Nautical Miles: " + nauticalMiles);
    }
}
