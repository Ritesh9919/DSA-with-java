package array;
import java.util.*;

public class PrintAllPairs {

    public static void printAllPairs(int[] arr) {
        for(int i = 0; i < arr.length-1;i++) {
            for(int j = i+1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,3,8,9};
        printAllPairs(arr);
        
    }
}
