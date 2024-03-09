package twoDArray;
import java.util.*;

public class inputAndPrint {

    public static int[][] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols = sc.nextInt();

        int[][] arr2d = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.println("Enter the element at " + i + " row " + j + " column");
                arr2d[i][j] = sc.nextInt();
            }
        }
        return arr2d;
    }

    public static void print(int[][] arr2d) {
        for(int i = 0; i < arr2d.length; i++) {
            for(int j = 0; j < arr2d[i].length; j++ ) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      
        int[][] arr2d = takeInput();
        print(arr2d);

        
    }
}
