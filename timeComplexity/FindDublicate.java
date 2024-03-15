package timeComplexity;

import java.util.Arrays;

public class FindDublicate {
    public static int findDublicate(int[] arr) {
        Arrays.sort(arr);
        int ans = -1;

		for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
				ans = arr[i];
			}
		}
		return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,4,2,7,1};
        System.out.println(findDublicate(arr));
    }
}
