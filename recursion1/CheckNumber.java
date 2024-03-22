package recursion1;

public class CheckNumber {

    public static boolean checkNumber(int[] arr, int x, int index) {
        if(index == arr.length) {
            return false;
        }

        if(arr[index] == x) {
            return true;
        }

        return checkNumber(arr, x, index+1);
    }
    public static void main(String[] args) {
        int[] arr = {2,5,4,1,9};
        int x = 1;
        System.out.println(checkNumber(arr, x, 0));
    }
}
