package apcs.fraction;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    Fraction add(Fraction other) {
        int num = this.numerator * other.getDenominator() + this.denominator * other.getNumerator();
        int denom = this.denominator * other.getDenominator();
        Fraction newFrac = new Fraction(num, denom);
        return newFrac;
    }

    Fraction subtract(Fraction other) {
        int num = this.numerator * other.getDenominator() - this.denominator * other.getNumerator();
        int denom = this.denominator * other.getDenominator();
        Fraction newFrac = new Fraction(num, denom);
        return newFrac;
    }

    Fraction multiply(Fraction other) {
        int num = this.numerator * other.getNumerator();
        int denom = this.denominator * other.getDenominator();
        Fraction newFrac = new Fraction(num, denom);
        return newFrac;
    }

    Fraction divide (Fraction other) {
        int num = this.numerator * other.getDenominator();
        int denom = this.denominator * other.getNumerator();
        Fraction newFrac = new Fraction(num, denom);
        return newFrac;
    }

    public boolean equals (Fraction other) {
        if(this.numerator*other.getDenominator() == this.denominator * other.getNumerator()){
            return true;
        }else{
            return false;
        }
    }

//    Fraction simplify (){
//        for(int i = 1; i < this.denominator; i++){
//            if (x == int(x))
//        }
//    }

    Fraction exponent (){

    }

}
