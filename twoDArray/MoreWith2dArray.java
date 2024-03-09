package twoDArray;

public class MoreWith2dArray{
   public static void main(String[] args) {
    //    int[][] arr = new int[][5]; // you can not do this

    // int[][] arr = new int[4][]; // you can do this
    // System.out.println(arr);
    // System.out.println(arr[0]);
    // System.out.println(arr[0][1]); // it give null pointer Exeption


    int[][] arr = new int[4][];

    for(int i = 0; i < arr.length; i++) {
        arr[i] = new int[i+2];
    }

    // System.out.println(arr[0][1]); // now int print 0

    // when number of col is diffrent

    for(int i = 0; i < arr.length; i++) {
        for(int j = 0; j < arr[i].length;j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }





      


   }
}