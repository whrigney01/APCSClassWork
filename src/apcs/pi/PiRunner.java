package apcs.pi;

import java.util.Scanner;

public class PiRunner {
    public static void main(String[] args) {
        //part 1
        Scanner reader = new Scanner (System.in);
        System.out.println("Pi can be calculated by using an equation that alternates adding and subtracting descending fractions.");
        System.out.println("For example, Pi = 4/1 - 4/3 + 4/5 - 4/7 + 4/9 ...");
        System.out.print("How many term do you want to add together? ");
        int numTerms = reader.nextInt();
        double piApprox = 0.0;
        double fraction = 0.0;
        int posNeg = 1;
        for (double i = 1.0; i <= numTerms * 2; i += 2){
            fraction = 4/(i * posNeg);
            posNeg *= -1;
            piApprox += fraction;

        }
        System.out.println("Pi approximated to " + numTerms + " terms is " + piApprox);
       //part 2
        System.out.println();
        System.out.println("Pi can also be calculated with the same equation but with a threshold of the smallest number, instead of a fixed amount of terms.");
        System.out.print("What should the smallest decimal possible be? ");
        double threshold = reader.nextDouble();
        double denom = 1.0;
        piApprox = 0.0;
        fraction = 1.0;
        posNeg = 1;
        numTerms = 0;
        while (Math.abs(fraction) > threshold){
                fraction = 4.0 / (denom * posNeg);
                posNeg *= -1;
                denom += 2;
                piApprox += fraction;
                numTerms++;
            }
        System.out.println("Pi approximated until a term is less than " + threshold + " is " + piApprox);
        System.out.println("It required "+ numTerms + " terms to make this approximation");
        //part 3
        System.out.println();
        System.out.println("A 3rd way to approximate pi is to generate random coordinate pairs with in a box and see how many of those points fall with in a circle with a area of pi.");
        System.out.print("How many coordinate pairs should be generated? ");
        int numCoords = reader.nextInt();
        double pointsInCircle = 0;
        for (int i = 0; i < numCoords; i++){
            double xValue = (Math.random() * 2) - 1;
            double yValue = (Math.random() * 2) - 1;
            if ((Math.pow(xValue, 2) + Math.pow(yValue, 2)) < 1){
                pointsInCircle ++;
            }
        }
        System.out.println(numCoords + " points were generated");
        System.out.println(pointsInCircle + " were inside the circle");
        System.out.println("Pi/4 is approximately " + (int) pointsInCircle + "/" + numCoords + " = " + (pointsInCircle/numCoords));
        System.out.println(("Pi is approximately " + (pointsInCircle/numCoords)* 4.0));
        //extension
        System.out.println();
        System.out.println("All of the equations so far have been approximations and not very accurate. The next equation can calculate Pi accurately to a certain amount of decimal places.");
        System.out.print("How many decimal places would you like Pi to be accurate to? ");
        int places = reader.nextInt();
        threshold = 1.0/(Math.pow(10, places));
        fraction = 1.0;
        piApprox = 0.0;
        posNeg = 1;
        numTerms = 0;
        denom = 1.0;
        while (Math.abs(fraction) > threshold){
            fraction = 4.0 / (denom * posNeg);
            posNeg *= -1;
            denom += 2;
            piApprox += fraction;
            numTerms++;
        }
        System.out.println(fraction);
    }
}
