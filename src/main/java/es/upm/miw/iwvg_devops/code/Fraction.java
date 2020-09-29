package es.upm.miw.iwvg_devops.code;

public class Fraction {
    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper() {
        return this.numerator < this.denominator;
    }

    public boolean isImproper() {
        return !this.isProper();
    }

    public boolean isEquivalent(Fraction otherFraction) {
        return this.decimal() == otherFraction.decimal();
    }

    public Fraction multiply(Fraction otherFraction) {
        return new Fraction(this.numerator * otherFraction.getNumerator(),
                this.denominator * otherFraction.getDenominator());
    }

    public Fraction divide(Fraction otherFraction) {
        return new Fraction(this.numerator * this.getDenominator(),
                this.denominator * otherFraction.getNumerator());
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
