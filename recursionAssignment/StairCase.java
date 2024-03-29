package recursionAssignment;

public class StairCase {

    public static int stairCase(int n) {
        if(n == 0) {
            return 1;
        }

        if(n == 1 || n == 2) {
            return n;
        }

        int a = stairCase(n-1);
        int b = stairCase(n-2);
        int c = stairCase(n-3);
        return a + b + c;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(stairCase(n));
    }
}
