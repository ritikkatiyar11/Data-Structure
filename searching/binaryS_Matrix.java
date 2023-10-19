public class binaryS_Matrix {
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int row=0,col=matrix[0].length-1;
         int target=5;

        while(row<matrix.length && col>=0)
        {
            if(matrix[row][col]==target)
            {
               int [] ans={row,col};
            }
            if(matrix[row][col]<target)
            {
                row++;
            }
            else
            {
                col--;
            }
        }

    }
}
