package recursion1;

public class FibonacciNumber {

    public static int fibonacci(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }

        int smallOutput1 = fibonacci(n-1);
        int smallOutput2 = fibonacci(n-2);
        int output = smallOutput1 + smallOutput2;
        return output;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
