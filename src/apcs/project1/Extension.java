package apcs.project1;
import java.util.Scanner;


public class Extension {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println("Quadratic Formula");
        System.out.print("a = ");
        double a = reader.nextInt ();
        System.out.print("b = ");
        double b = reader.nextInt ();
        System.out.print("c = ");
        double c = reader.nextInt ();
        double posQuadFormula = ((-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a));
        double negQuadFormula = ((-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a));
        System.out.println(posQuadFormula + "," + negQuadFormula);

    }
}
