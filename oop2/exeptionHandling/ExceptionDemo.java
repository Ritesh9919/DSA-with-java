package oop2.exeptionHandling;

public class ExceptionDemo {

    public static int divide(int a, int b) throws DivideByZeroException {
        if(b == 0) {
            throw new DivideByZeroException();
        }
        return a / b;
    }
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (Exception e) {
          System.out.println("Divide by zero exception raised");
        }
        System.out.println("main");
        
    }
}
