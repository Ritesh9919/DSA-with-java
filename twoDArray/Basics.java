package twoDArray;

public class Basics {

    public static void print(int[][] arr) {
        for(int i = 0; i < arr.length;i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // int[][] arr = {{1,2,3,4},
        //               {5,6,7,8},
        //               {9,10,11,12}};
        // print(arr);
        int[][] arr2d = new int[3][4];
        arr2d[2][1] = 10;
        System.out.println(arr2d[2][1]);
        System.out.println(arr2d[3][1]);
        System.out.println(arr2d[1][0]);

    }
}
