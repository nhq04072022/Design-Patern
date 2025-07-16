package practiceweek123;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author quanthaiha
 */
public class Polynomial {

    private static final int MAXSIZE = 100;
    private int degree = 0;
    private int[] coefs = new int[MAXSIZE];
    
    /**
     * Initializes a new polynomial a x^b
     * @param a the leading coefficient
     * @param b the exponent
     * @throws IllegalArgumentException if {@code b} is negative
     */
    public Polynomial(int a, int b) {
        if (b < 0) {
            throw new IllegalArgumentException("exponent cannot be negative: " + b);
        }
        coefs = new int[b + 1];
        coefs[b] = a;
        
        reduce();
    }
    
    /**
     * Initializes a new polynomial 1 + x + ... + x^(degree)
     * @param degree the power of polynomial
     * @throws IllegalArgumentException if {@code b} is negative
     */
    public Polynomial(int degree) {
        if (degree >= MAXSIZE) {
            throw new IllegalArgumentException("degree of polynomial is too large: ");
        }
        
        this.degree = degree;
        for (int i = 0; i < degree; i++) {
            coefs[i] = 1;
        }
    }
    
    /**
     * Initializes a new polynomial arr[0] + arr[1]x + ... + arr[n]x^(degree)
     * @param arr the coefficients of the polynomial
     */
    public Polynomial(int[] arr) {
        if (arr == null) {
            return;
        }
        
        int i = 0;
        while ((i < degree) && (i < arr.length)) {
            this.coefs[i] = arr[i];
            i++;
        }
        
        reduce();
    }
    
    // pre-compute the degree of the polynomial, in case of leading zero coefficients
    // (that is, the length of the array need not relate to the degree of the polynomial)
    private void reduce() {
        degree = -1;
        for (int i = coefs.length - 1; i >= 0; i--) {
            if (coefs[i] != 0) {
                degree = i;
                return;
            }
        }
    }
    
    /**
     * Return a string representation of this polynomial.
     *
     * @return a string representation of this polynomial in the format 4x^5 -
     * 3x^2 + 11x + 5
     */
    @Override
    public String toString() {
        if (degree < 0) {
            return "0";
        } else if (degree == 0) {
            return "" + coefs[0];
        } else if (degree == 1) {
            return coefs[1] + "x + " + coefs[0];
        }
        
        String polyString = coefs[degree] + "x^" + degree;
        for (int i = degree - 1; i >= 0; i--) {
            if (coefs[i] == 0) {
                continue;
            } else if (coefs[i] > 0) {
                polyString = polyString + " + " + (coefs[i]);
            } else if (coefs[i] < 0) {
                polyString = polyString + " - " + (-coefs[i]);
            }
            
            if (i == 1) {
                polyString = polyString + "x";
            } else if (i > 1) {
                polyString = polyString + "x^" + i;
            }
        }
        return polyString;
    }
    
    /**
     * Print polynomial
     */
    public void print() {
        System.out.print(this);
    }
    
    /**
     * Compares this polynomial to the specified polynomial.
     *
     * @param other the other polynomial
     * @return {@code true} if this polynomial equals {@code other};
     * {@code false} otherwise
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        
        if (other == null) {
            return false;
        }
        
        if (other.getClass() != this.getClass()) {
            return false;
        }
        
        Polynomial that = (Polynomial)other;
        if (this.degree != that.degree) {
            return false;
        }
        
        for (int i = this.degree; i >= 0; i--) {
            if (this.coefs[i] != that.coefs[i]) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Compares two polynomials by degree, breaking ties by coefficient of
     * leading term.
     *
     * @param other the other point
     * @return the value {@code 0} if this polynomial is equal to the argument
     * polynomial (precisely when {@code equals()} returns {@code true}); a
     * negative integer if this polynomial is less than the argument
     * polynomial; and a positive integer if this polynomial is greater than the
     * argument point
     */
    public int compareTo(Polynomial other) {
        if (this.degree < other.degree) {
            return -1;
        }
        
        if (this.degree > other.degree) {
            return +1;
        }
        
        for (int i = this.degree; i >= 0; i--) {
            if (this.coefs[i] < other.coefs[i]) {
                return -1;
            }
            
            if (this.coefs[i] > other.coefs[i]) {
                return +1;
            }
        }
        
        return 0;
    }
    
    /**
     * Returns the result of evaluating this polynomial at the point x.
     *
     * @param x the point at which to evaluate the polynomial
     * @return the integer whose value is {@code (this(x))}
     */
    public int evaluate(int x) {
        int p = 0;
        for (int i = degree; i >= 0; i--) {
            p = coefs[i] + (x * p);
        }
        
        return p;
    }
    
    /**
     * Returns the result of differentiating this polynomial.
     *
     * @return the polynomial whose value is {@code this'(x)}
     */
    public Polynomial differentiate() {
        if (degree == 0) {
            return new Polynomial(0);
        }
        
        Polynomial poly = new Polynomial(degree - 1);
        poly.degree = degree - 1;
        for (int i = 0; i < degree; i++) {
            poly.coefs[i] = (i + 1) * coefs[i + 1];
        }
        
        return poly;
    }
    
    /**
     * Returns the sum of this polynomial and the specified polynomial.
     *
     * @param that the other polynomial
     * @return the polynomial whose value is {@code (this(x) + that(x))}
     */
    public Polynomial plus(Polynomial that) {
        Polynomial poly = new Polynomial(Math.max(this.degree, that.degree));
        for (int i = 0; i <= this.degree; i++) {
            poly.coefs[i] += this.coefs[i];
        }
        
        for (int i = 0; i <= that.degree; i++) {
            poly.coefs[i] += that.coefs[i];
        }
        
        poly.reduce();
        return poly;
    }
    
    /**
     * Returns the result of subtracting the specified polynomial from this
     * polynomial.
     *
     * @param other the other polynomial
     * @return the polynomial whose value is {@code (this(x) - that(x))}
     */
    public Polynomial minus(Polynomial other) {
        Polynomial poly = new Polynomial(Math.max(this.degree, other.degree));
        for (int i = 0; i <= this.degree; i++) {
            poly.coefs[i] += this.coefs[i];
        }
        
        for (int i = 0; i <= other.degree; i++) {
            poly.coefs[i] -= other.coefs[i];
        }
        
        poly.reduce();
        return poly;
    }
    
    /**
     * Returns the product of this polynomial and the specified polynomial.
     * Takes time proportional to the product of the degrees. (Faster algorithms
     * are known, e.g., via FFT.)
     *
     * @param other the other polynomial
     * @return the polynomial whose value is {@code (this(x) * that(x))}
     */
    public Polynomial times(Polynomial other) {
        Polynomial poly = new Polynomial(this.degree + other.degree);
        for (int i = 0; i <= this.degree; i++) {
            for (int j = 0; j <= other.degree; j++) {
                poly.coefs[i + j] += (this.coefs[i] * other.coefs[j]);
            }
        }
        
        poly.reduce();
        return poly;
    }
    
    public int[] toArray() {
        return this.coefs;
    }
    
    public int getCoefficient(int term) throws IndexOutOfBoundsException {
        if (term > degree) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        
        return coefs[term];
    }
    
    public void setCoefficient(int term, int value) throws IndexOutOfBoundsException {
        if (term > degree) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        
        this.coefs[term] = value;
    }
    
    public void setCoefficients(int[] coefs) {
        if (coefs == null) {
            return;
        }
        
        int minLength = Math.min(this.coefs.length, coefs.length);
        System.arraycopy(coefs, 0, this.coefs, 0, minLength);
    }
    
    public void addTerm(int term, int coef) throws IndexOutOfBoundsException {
        if (term < 0) {
            throw new IndexOutOfBoundsException("out of index");
        }
        
        if (term >= (this.coefs.length - 1)) {
            throw new IndexOutOfBoundsException("Can not add more term");
        }
        
        if (term > degree) {
            for (int i = degree + 1; i < term; i++) {
                this.coefs[i] = 0;
            }
            this.coefs[term] = coef;
        }
        
        for (int i = degree + 1; i > term; i--) {
            this.coefs[i] = this.coefs[i - 1];
        }
        this.coefs[term] = coef;
    }
    
    public void removeTerm(int term) throws IndexOutOfBoundsException {
        if ((term < 0) || (term > degree)) {
            throw new IndexOutOfBoundsException("Remove term out of index");
        }
        
        this.coefs[term] = 0;
    }
}
