package array;

public class FindDublicate {

    public static int findDublicate(int[] arr) {
        int n = arr.length;
        
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,6,5,7,8};
        System.out.println(findDublicate(arr));
    }
}
