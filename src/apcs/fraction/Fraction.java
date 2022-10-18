package apcs.fraction;

//Extension: I made a simplify method that uses the Euclidean Algorithm to find the greatest common factors through subtraction. I also added a exponent method that uses Math.pow to raise the fraction to a certain power.
// Finally, I added a compare method that lets the user specify weather they want to know if the fraction is greater than or less than the other fraction that they pass through.
/**
 * The fraction class can be used to add, subtract, multiply, divide and compare
 * fractions without the loss of accuracy that comes with using the primitive double
 * data type
 */
public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * Creates a new fraction with a specified numerator and denominator
     *
     * @param numerator   new fraction's numerator
     * @param denominator new fraction's denominator
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Gets the fraction's numerator
     *
     * @return The numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Gets the fraction's denominator
     *
     * @return The denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Sets the fraction's numerator
     *
     * @param numerator New numerator
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Sets the fraction's denominator
     *
     * @param denominator New denominator
     */
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
            return numerator + "/" + denominator;
    }

    /**
     * Adds the passed fraction to this fraction and returns result as a new fraction
     *
     * @param other Other fraction to be added
     * @return A new fraction that is the sum of this fraction and the passed fraction
     */
    Fraction add(Fraction other) {
        int num = this.numerator * other.getDenominator() + this.denominator * other.getNumerator();
        int denom = this.denominator * other.getDenominator();
        Fraction newFrac = new Fraction(num, denom);
        return newFrac;
    }

    /**
     * Subtracts this fraction and a passed fraction
     *
     * @param other Other fraction to be subtracted
     * @return A new fraction that is the different between this fraction and the passed fraction
     */
    Fraction subtract(Fraction other) {
        int num = this.numerator * other.getDenominator() - this.denominator * other.getNumerator();
        int denom = this.denominator * other.getDenominator();
        Fraction newFrac = new Fraction(num, denom);
        return newFrac;
    }

    /**
     * Multiplies this fraction and a passed fraction
     *
     * @param other Other fraction to be multiplied
     * @return A new fraction that is the product of this fraction and the passed fraction
     */
    Fraction multiply(Fraction other) {
        int num = this.numerator * other.getNumerator();
        int denom = this.denominator * other.getDenominator();
        Fraction newFrac = new Fraction(num, denom);
        return newFrac;
    }

    /**
     * Divides this fraction and a passed fraction
     *
     * @param other Other fraction to be divided
     * @return A new fraction that is the quotient of this fraction and the passed fraction
     */
    Fraction divide(Fraction other) {
        int num = this.numerator * other.getDenominator();
        int denom = this.denominator * other.getNumerator();
        Fraction newFrac = new Fraction(num, denom);
        return newFrac;
    }

    public boolean equals(Fraction other) {
        if (this.numerator * other.getDenominator() == this.denominator * other.getNumerator()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Simplifies the fraction
     *
     * @return Most simplified version of the fraction. Returns null if the fraction is undefined
     */
    Fraction simplify() {
        int firstNum = Math.abs(this.numerator);
        int secondNum = Math.abs(this.denominator);
        int posNeg = 1;
        int gcf = 1;

        if (this.denominator < 0 && this.numerator < 0) {
            posNeg = -1;
        }

        if (this.denominator == 0) {
            return null;
        }

        while (firstNum != secondNum) {
            if (firstNum > secondNum) {
                firstNum -= secondNum;
            } else {
                secondNum -= firstNum;
            }
        }
        gcf = firstNum * posNeg;
        return new Fraction(this.numerator / gcf, this.denominator / gcf);
    }

    /**
     * Raises the fraction to a passed power
     *
     * @param power The power that the fraction should be raised to
     * @return New fraction that is the original fraction raised to the passed power
     */
    Fraction exponent(int power) {
        return new Fraction((int) Math.pow(this.numerator, power), (int) Math.pow(this.denominator, power));
    }

    /**
     * Compares 2 fractions to see if it is greater than or less than the other passed fraction
     *
     * @param type  "greater" or "less" based on what the user wants to compare
     * @param other other fraction to be compared
     * @return returns true if the fraction is greater than or less than based on what type the user passes through
     */
    public Boolean compare(String type, Fraction other) {
        int comDenom = this.denominator * other.getDenominator();
        if (type.equals("greater")) {
            int num1 = this.numerator * comDenom;
            int num2 = other.getNumerator() * comDenom;
            if (num1 > num2) {
                return true;
            } else {
                return false;
            }
        } else {
            int num1 = this.numerator * comDenom;
            int num2 = other.getNumerator() * comDenom;
            if (num1 > num2) {
                return false;
            } else {
                return true;
            }
        }
    }
}
