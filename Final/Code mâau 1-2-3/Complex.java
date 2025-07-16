
package practiceweek123;

class Complex {

    private double real;
    private double imag;

    // CONSTRUCTOR
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // ACCESSORS
    public double realPart() {
        return this.real;
    }

    public double imagPart() {
        return this.imag;
    }

    public double magnitude() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    public double angle() {
        if (real != 0) {
            if (real < 0) {
                return (Math.PI + Math.atan(imag / real));
            } else {
                return Math.atan(imag / real);
            }
        } else if (imag == 0) {
            return 0;
        } else if (imag > 0) {
            return Math.PI / 2;
        } else {
            return -Math.PI / 2;
        }
    }

    // MUTATORS
    public void add(Complex other) {
        this.real += other.realPart();
        this.imag += other.imagPart();
    }

    public void minus(Complex other) {
        this.real -= other.realPart();
        this.imag -= other.imagPart();
    }

    public void times(Complex other) {
        double tempReal = real * other.realPart() - imag * other.imagPart();
        imag = real * other.imagPart() + imag * other.realPart();
        real = tempReal;
    }

    // for printing... 
    @Override
    public String toString() {
        if (imag == 0) {
            return (real + "");
        } else if (imag < 0) {
            return (real + " " + imag + "i");
        } else {
            return (real + " + " + imag + "i");
        }
    }
}
