package array;

public class FindUnique {

    public static int findUnique(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            int j = 0;
            while(j < n) {
                if(i != j && arr[i] == arr[j]) {
                    break;
                }
                j++;
            }
            if(j == n) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,6,2,5};
        System.out.println(findUnique(arr));
    }
}
