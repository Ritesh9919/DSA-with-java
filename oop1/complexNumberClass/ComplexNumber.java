package oop1.complexNumberClass;

public class ComplexNumber {
    private int realNumber;
    private int imaginaryNumber;

    public ComplexNumber(int realNumber, int imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public void print() {
        System.out.println(this.realNumber + " + i" + this.imaginaryNumber);
    }

    public void add(ComplexNumber c2) {
        this.realNumber = this.realNumber + c2.realNumber;
        this.imaginaryNumber = this.imaginaryNumber + c2.imaginaryNumber;
    }

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        int newReal = c1.realNumber + c2.realNumber;
        int newImg = c1.imaginaryNumber + c2.imaginaryNumber;
        ComplexNumber c3 = new ComplexNumber(newReal, newImg);
        return c3;
    }

    public void multiply(ComplexNumber c2) {
        int real = (this.realNumber * c2.realNumber) - (this.imaginaryNumber * c2.imaginaryNumber);
        int imaginary = (this.realNumber * c2.imaginaryNumber) + (this.imaginaryNumber * c2.realNumber);
        this.realNumber = real;
        this.imaginaryNumber = imaginary;
         
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(4, 5);
        c1.print();
        ComplexNumber c2 = new ComplexNumber(3, 7);
        // c1.add(c2);
        // c1.print();
        // ComplexNumber c3 = ComplexNumber.add(c1, c2);
        // c3.print();
        c1.multiply(c2);
        c1.print();

    }
}
