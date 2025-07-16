package hw4.ex1;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    public boolean isReal() {
        return imag == 0;
    }

    public boolean isImaginary() {
        return real == 0;
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        double epsilon = 10E-8;
        return (this.real - another.getReal() <= epsilon && this.imag - another.getImag() <= epsilon);
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return Math.atan2(imag, real);
    }

    public MyComplex add(MyComplex right) {
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(real + right.getReal(), imag + right.getImag());
    }

    public MyComplex subtract(MyComplex right) {
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(real - right.getReal(), imag - right.getImag());
    }

    public MyComplex multiply(MyComplex right) {
        return new MyComplex(real * right.getReal() - imag * right.getImag(),
                real * right.getImag() - imag * right.getReal());
    }

    public MyComplex divide(MyComplex right) {
        MyComplex tmp = multiply(right.conjugate());
        double delimiter = right.getReal() * right.getReal() + right.getImag() * right.getImag();
        if (delimiter != 0) {
            real = tmp.getReal() / delimiter;
            imag = tmp.getImag() / delimiter;
        }
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }
}
