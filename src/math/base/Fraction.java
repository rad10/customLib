package math.base;

public class Fraction {
    private int numerator, denominator;

    public Fraction(int num, int dem) {
        numerator = num;
        denominator = dem;
    }

    public Fraction(int num) {
        numerator = num;
        denominator = 1;
    }

    public int num() {
        return numerator;
    }

    public int dem() {
        return denominator;
    }

    public double Double() {
        double n = numerator;
        double d = denominator;
        return n / d;
    }

    public float Float() {
        float n = numerator;
        float d = denominator;
        return n / d;
    }

    public void rationalize() {
        while ((numerator % 1 > 0) || (denominator % 1 > 0)) {
            numerator *= 10;
            denominator *= 10;
        }
    }

    public void add(int number) {
        numerator += number * denominator;
    }

    public void add(Fraction f) {
        numerator = numerator * f.dem() + denominator * f.num();
        denominator *= f.dem();
    }

    public void multiplyBy(int number) {
        numerator *= number;
    }

    public void multiplyBy(Fraction f) {
        numerator *= f.num();
        denominator *= f.dem();
    }
}