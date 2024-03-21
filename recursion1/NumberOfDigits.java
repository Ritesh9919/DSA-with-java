

package recursion1;

public class NumberOfDigits {
    public static int numberOfDigits(int n) {
        if(n == 0) {
            return 0;
        }

        int smallOutput = numberOfDigits(n/10);
        int output = 1 + smallOutput;
        return output;
    }
  public static void main(String[] args) {
    int n = 123;
    int num = numberOfDigits(n);
    System.out.println(num);
  }
    
}