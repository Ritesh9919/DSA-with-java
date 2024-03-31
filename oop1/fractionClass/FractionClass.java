package oop1.fractionClass;

public class FractionClass {
    private int numerator;
    private int denumerator;

    public FractionClass(int numerator, int denumerator) {
        if(denumerator == 0) {
            this.denumerator = denumerator;
        }
        this.numerator = numerator;
        this.denumerator = denumerator;
        simplify();
    }

    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(this.numerator, this.denumerator);
        for(int i = 2; i <= smaller; i++) {
            if(this.numerator % i == 0 && this.denumerator % i == 0) {
                gcd = i;
            }
        }

        this.numerator = this.numerator / gcd;
        this.denumerator = this.denumerator / gcd;
    }

    public void increment() {
        this.numerator = this.numerator + this.denumerator;
    }

    public void print() {
        System.out.println(this.numerator + "/" + this.denumerator);
    }

    public int getNumerator() {
        return this.numerator;
    }

    public void setNumerator(int num) {
       
        this.numerator = num;
        simplify();
    }

    public int getDenomerator() {
        return this.denumerator;
    }

    public void setDenomerator(int num) {
              if(num == 0) {
                // throw error
                return;
              }
              this.denumerator = num;
              simplify();

    }

    public void add(FractionClass f2) {
        this.numerator = this.numerator * f2.denumerator + this.denumerator * f2.numerator;
        this.denumerator = this.denumerator * f2.denumerator;
        simplify();
    }

    public void substract(FractionClass f2) {
        this.numerator =  this.denumerator * f2.numerator - this.numerator * f2.denumerator;
        this.denumerator = this.numerator * f2.denumerator;
        simplify();
    }

    public static FractionClass add (FractionClass f1, FractionClass f2) {
        int newNum = f1.numerator * f2.denumerator + f1.denumerator * f2.numerator;
        int newDen = f1.denumerator * f2.denumerator;
        FractionClass f3 = new FractionClass(newNum, newDen);
        return f3;
    }
    public static void main(String[] args) {
        FractionClass f1 = new FractionClass(8, 24);
        FractionClass f2 = new FractionClass(3, 6);
        // f1.print();
        // // f1.increment();
        // f1.add(f2);
        // f1.print();
        // FractionClass f3 = FractionClass.add(f1, f2);
        // f3.print();
        f1.substract(f2);
        f1.print();

    }
}
