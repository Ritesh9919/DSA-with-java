package recursion1;

public class SumOfNaturalNum {
    public static int sumOfNaturalNum(int n) {
        if(n == 0) {
            return 0;
        }

        int smallOutput = sumOfNaturalNum(n-1);
        int output = n + smallOutput;
        return output;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(sumOfNaturalNum(n));
    }
}
