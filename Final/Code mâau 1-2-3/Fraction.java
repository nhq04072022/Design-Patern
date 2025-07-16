
package practiceweek123;

class Fraction {

    /**
     * ************ Data members *********************
     */
    private int numerator;
    private int denominator;

    /**
     * ************ Constructors *********************
     */
    // Default constructor creates a fraction 1/1
    public Fraction() {
        this(1, 1);
    }

    public Fraction(int numerator, int denominator) {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    /**
     * ************** Accessors **********************
     */
    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    /**
     * ************** Mutators ***********************
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    /**
     * *************** Other methods *****************
     */
    // Returns greatest common divisor of a and b
    // private method as this is not accessible to clients
    private static int gcd(int a, int b) {
        int remainder;
        while (b > 0) {
            remainder = a % b;
            a = b;
            b = remainder;
        }
        
        return a;
    }

    // Returns simplified fraction
    public Fraction simplify() {
        int numer = this.getNumerator();
        int denom = this.getDenominator();
        int gcd = Fraction.gcd(Math.abs(numer), denom);

        return new Fraction(numer / gcd, denom / gcd);
    }

    public Fraction add(Fraction other) {
        int numer = (this.getNumerator() * other.getDenominator())
                    + (other.getNumerator() * this.getDenominator());
        int denom = this.getDenominator() * other.getDenominator();

        Fraction result = new Fraction(numer, denom);
        return result.simplify();
    }

    public Fraction minus(Fraction other) {
        int numer = (this.getNumerator() * other.getDenominator())
                    - (other.getNumerator() * this.getDenominator());
        int denom = this.getDenominator() * other.getDenominator();

        Fraction result = new Fraction(numer, denom);
        return result.simplify();
    }

    public Fraction times(Fraction other) {
        int numer = this.getNumerator() * other.getNumerator();
        int denom = this.getDenominator() * other.getDenominator();

        Fraction result = new Fraction(numer, denom);
        return result.simplify();
    }

    /**
     * *************** Overriding methods *****************
     */
    // Overriding toString() method
    @Override
    public String toString() {
        return this.getNumerator() + "/" + this.getDenominator();
    }

    // Overriding equals() method
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction fraction1 = (Fraction)obj;
            fraction1 = fraction1.simplify();
            Fraction fraction2 = this.simplify();

            return (fraction1.getNumerator() == fraction2.getNumerator())
                    && (fraction1.getDenominator() == fraction2.getDenominator());
        } else {
            return false;
        }
    }
}
