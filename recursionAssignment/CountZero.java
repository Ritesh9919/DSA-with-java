package recursionAssignment;

public class CountZero {

    public static int countZero(int input) {
        if(input <= 9) {
            if(input == 0) {
                return 1;
            }else{
                return 0;
            }
        }

           int lastDigit = input % 10;
           if(lastDigit == 0) {
            return 1 + countZero(input/10);
           }else{
            return 0 + countZero(input/10);
           }
        
    }
    public static void main(String[] args) {
        System.out.println(countZero(1230301));
    }
}
