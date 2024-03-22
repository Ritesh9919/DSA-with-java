package recursion1;

public class LastIndex {

    public static int lastIndex(int[] arr, int x, int index) {
        if(index == arr.length) {
            return -1;
        }

        int isFound = lastIndex(arr, x, index+1);
        if(isFound == -1 && arr[index] == x) {
            return index;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,3,5,1};
        int x = 5;
        System.out.println(lastIndex(arr, x, 0));
    }
}
