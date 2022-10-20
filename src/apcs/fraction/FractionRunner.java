
package apcs.fraction;
import java.util.Scanner;

public class FractionRunner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Fraction f1 = new Fraction(1, 2);         // represents one-half
        System.out.print("One Half = ");
        System.out.println(f1);                   // should output   1 / 2
        f1.setNumerator(3);                       // change numerator to 3
        f1.setDenominator(4);                     // change denominator to 4
        int num = f1.getNumerator();              // get the numerator
        int den = f1.getDenominator();            // get the denominator
        System.out.print("Three Quarters = ");
        System.out.println(num + "/" + den);      // should output 3 / 4
        Fraction f2 = new Fraction(2, 3);
        System.out.print("Two Thirds = ");
        System.out.println(f2);
        Fraction sum = f1.add(f2);
        System.out.println(f1 + " + " + f2 + " = " + sum);
        f2 = new Fraction(1, 2);
        sum = f1.add(f2);
        Fraction difference = f1.subtract(f2);
        Fraction product = f1.multiply(f2);
        Fraction quotient = f1.divide(f2);

        System.out.println("F1: " + f1);
        System.out.println("F2: " + f2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        f1 = new Fraction(1, 2);
        f2 = new Fraction(1, 2);
        System.out.println(f1 + " == " + f2 + " = " + f1.equals(f2));
        System.out.println(f2 + " == " + f1 + " = " + f2.equals(f1));

        f2 = new Fraction(1, 3);
        System.out.println(f1 + " == " + f2 + " = " + f1.equals(f2));
        System.out.println(f2 + " == " + f1 + " = " + f2.equals(f1));

        f2 = new Fraction(2, 4);
        System.out.println(f1 + " == " + f2 + " = " + f1.equals(f2));
        System.out.println(f2 + " == " + f1 + " = " + f2.equals(f1));

        System.out.print("Enter a Numerator: ");
        int numerator = reader.nextInt();
        System.out.print("Enter a Denominator: ");
        int denominator = reader.nextInt();
        System.out.print("Enter an Operation (+, -, *, /): ");
        String op = reader.next();
        System.out.print("Enter a Numerator: ");
        int numerator2 = reader.nextInt();
        System.out.print("Enter a Denominator: ");
        int denominator2 = reader.nextInt();
        Fraction f4 = new Fraction(numerator, denominator);
        Fraction f5 = new Fraction(numerator2, denominator2);
        if (op.equals("*")) {
            System.out.println(f4.toString() + " * " + f5.toString() + " = " + f4.multiply(f5));
        } else if (op.equals("/")) {
            System.out.println(f4.toString() + " / " + f5.toString() + " = " + f4.divide(f5));
        } else if (op.equals("+")) {
            System.out.println(f4.toString() + " + " + f5.toString() + " = " + f4.add(f5));
        } else if (op.equals("-")) {
            System.out.println(f4.toString() + " - " + f5.toString() + " = " + f4.subtract(f5));
        } else {
            System.out.println("Try again and put an actual operation in enter an operation please.");
            System.out.println("Not passive aggressive at all");
        }

        System.out.println("\nEXTENSIONS");
        System.out.println();
        Fraction f3 = new Fraction(-6, -4);
        System.out.println(f3 + " simplified is " + f3.simplify());
        Fraction f6 = new Fraction(2, 4);
        System.out.println(f6 + " simplified is " + f6.simplify());
        Fraction f7 = new Fraction(4, 0);
        System.out.println(f7 + " simplified is " + f7.simplify());
        Fraction f8 = new Fraction(10, 30);
        System.out.println(f8 + " simplified is " + f8.simplify());

        System.out.println();

        Fraction f9 = new Fraction(2, 4);
        System.out.println(f9 + " raised to the power of 2 is " + f9.exponent(2));
        Fraction f10 = new Fraction(1, 8);
        System.out.println(f10 + " raised to the power of 6 is " + f10.exponent(6));

        System.out.println();

        if (f9.compare("greater", f10) == true) {
            System.out.println(f9 + " is greater than " + f10);
        } else {
            System.out.println(f10 + " is greater than " + f9);
        }

        System.out.println();

        if (f3.compare("less", f4) == true) {
            System.out.println(f3 + " is less than " + f4);
        } else {
            System.out.println(f4 + " is less than " + f3);
        }
    }
}

