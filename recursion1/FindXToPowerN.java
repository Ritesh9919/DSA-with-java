package recursion1;

public class FindXToPowerN {

    public static int findXToPowerN(int x, int n) {
        if(n == 0) {
            return 1;
        }

        int smallOutput = findXToPowerN(x, n-1);
        int output = x * smallOutput;
        return output;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 4;
        System.out.println(findXToPowerN(x,n));
    }
}
