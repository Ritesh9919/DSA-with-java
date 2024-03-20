package recursion1;

public class Basics {
    public static int fact(int n) {
        if(n == 1) {
            return 1;
        }
        int smallOutput = fact(n-1);
        int output = n * smallOutput;
        return output;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
