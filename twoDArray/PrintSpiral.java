package twoDArray;

public class PrintSpiral {
    public static void printSpiral(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
   
           int element = matrix[0].length * matrix.length;
   
           int rowLowLim = 0;
           int rowUpLim = matrix.length-1;
           int colLowLim = 0;
           int colUpLim = matrix[0].length-1;
   
           while(element > 0) {
               // left to right
               for(int i = colLowLim; i <= colUpLim; i++) {
                   System.out.print(matrix[rowLowLim][i] + " ");
                   element--;
               }
               rowLowLim++;
   
               // top to bottom
               for(int i = rowLowLim; i <= rowUpLim; i++) {
                   System.out.print(matrix[i][colUpLim] + " ");
                   element--;
               }
   
               colUpLim--;
   
               // right to left
               for(int i = colUpLim; i >= colLowLim && element > 0; i--) {
                   System.out.print(matrix[rowUpLim][i] + " ");
                   element--;
               }
   
               rowUpLim--;
   
               // bottom to top
               for(int i = rowUpLim; i >= rowLowLim && element > 0; i--) {
                   System.out.print(matrix[i][colLowLim] + " ");
                   element--;
               }
   
               colLowLim++;
           }
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        printSpiral(mat);
    }
    

}
