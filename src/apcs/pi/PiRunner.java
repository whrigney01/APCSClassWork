package apcs.pi;
import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;

public class PiRunner {
    public static void main(String[] args) {
        //part 1
        Scanner reader = new Scanner (System.in);
//        System.out.println("Pi can be calculated by using an equation that alternates adding and subtracting descending fractions.");
//        System.out.println("For example, Pi = 4/1 - 4/3 + 4/5 - 4/7 + 4/9 ...");
//        System.out.print("How many term do you want to add together? ");
//        int numTerms = reader.nextInt();
        double piApprox = 0.0;
        double fraction = 0.0;
        int posNeg = 1;
//        for (double i = 1.0; i <= numTerms * 2; i += 2){
//            fraction = 4/(i * posNeg);
//            posNeg *= -1;
//            piApprox += fraction;
//
//        }
//        System.out.println("Pi approximated to " + numTerms + " terms is " + piApprox);
//        //part 2
        System.out.println("Pi can also be calculated with the same equation but with a threshold of the smallest number, instead of a fixed amount of terms.");
        System.out.print("What should the smallest decimal possible be? ");
        double threshold = reader.nextDouble();
        double denom = 1.0;
        piApprox = 0.0;
        fraction = 0.0;
        posNeg = 1;
        int numTerms = 0;
        while (fraction > threshold){
                fraction = 4 / (denom * posNeg);
                posNeg *= -1;
                denom += 2;
                piApprox += fraction;
                numTerms++;
            }
        System.out.println("Pi approximated until a term is less than " + threshold + " is " + piApprox);
        System.out.println("It required "+ numTerms + " terms to make this approximation");
        }
    }
}
