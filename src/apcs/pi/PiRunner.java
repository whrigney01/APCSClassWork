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
        // To approximate Pi accuretly I made a variable that is equal to 2 * the inverse of cosine which is equal to Pi.
        // I then multiplied the approximated poi (from same equation as first 2 parts) value by 10, 100, 1000... and then rounded it down to compare 2 whole numbers.
        //for larger numbers like 7 or 8, the program takes a while to loop through the code and get to the very small decimals so the code is probably just thinking and not broken.
        System.out.println();
        System.out.println("All of the equations so far have been approximations and not very accurate.");
        System.out.println("The next equation uses exponents and to compare whole numbers so it can calculate Pi accurately to a certain amount of decimal places.");
        System.out.println("Example: 4 decimal places would be 3.1415");
        System.out.print("How many decimal places would you like Pi to be accurate to? (Max of 8) ");
        int decPlaces = reader.nextInt();
        fraction = 1.0;
        denom = 1.0;
        posNeg = 1;
        piApprox = 0.0;
        numTerms = 0;
        double piCheck = 2 * Math.acos(0.0);
        for(int i = 0; i<Integer.MAX_VALUE; i++){
            fraction = 4.0 / denom * posNeg;
            piApprox += fraction;
            denom += 2;
            posNeg *= -1;
            numTerms++;
            double approxPiRound = Math.floor(piApprox * (Math.pow(10, decPlaces)));
            double piRound = Math.floor(piCheck * (Math.pow(10, decPlaces)));
            if (piRound == approxPiRound) {
                i = Integer.MAX_VALUE - 1;
            }
        }
        System.out.println("Pi approximated accurately to " + decPlaces + " decimal points is " + piApprox);
        System.out.println("It required " + numTerms + " terms to make this approximation");
    }
}
