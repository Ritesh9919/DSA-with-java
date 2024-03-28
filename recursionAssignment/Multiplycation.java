package recursionAssignment;

public class Multiplycation {
    public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
		if(n == 0) {
			return 0;
		}

		int smallOutput = multiplyTwoIntegers(m, n-1);
		return m + smallOutput;
	
	}
    public static void main(String[] args) {
        System.out.println(multiplyTwoIntegers(3, 5));
    }
}
