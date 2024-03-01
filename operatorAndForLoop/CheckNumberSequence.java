
package operatorAndForLoop;


public class CheckNumberSequence {

    public static void checkNumberSequence(int[] numbers) {
        boolean isDecreasing = true;
        int prev = numbers[0];
        int count = 1;

        while (count < numbers.length) {
            int current = numbers[count];

            if(current == prev) {
                System.out.println("false");
                return;
            }

            if(current < prev && isDecreasing == false) {
                System.out.println("false");
                return;
            }else{
                if(current > prev && isDecreasing == true) {
                    isDecreasing = false;
                }
            }
            prev = current;
            count++;
        }

        System.out.println("true");
    }

    public static void main(String[] args) {
        int[] numbers = {8,5,3,5,6};
        checkNumberSequence(numbers);
    }
}