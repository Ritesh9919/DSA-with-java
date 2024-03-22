package recursion1;

public class FirstIndex {

    public static int firstIndex(int[] arr, int x, int index) {
        if(index == arr.length) {
            return -1;
        }

        if(arr[index] == x) {
            return index;
        }

        return firstIndex(arr, x, index+1);
    }
    public static void main(String[] args) {
        int[] arr = {2,5,4,1,9};
        int x = 4;
        System.out.println(firstIndex(arr,x,0));
    }
}
