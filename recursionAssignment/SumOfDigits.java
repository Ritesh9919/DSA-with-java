package recursionAssignment;

public class SumOfDigits {
    public static int sumOfDigits(int input){
		if(input == 0) {
			return 0;
		}
		// Write your code here
		int smallOutput = sumOfDigits(input/10);
		int ans = input % 10 + smallOutput;
		return ans;

	}
    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
    }
}
