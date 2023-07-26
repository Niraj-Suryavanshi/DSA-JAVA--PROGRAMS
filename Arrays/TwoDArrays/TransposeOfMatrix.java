public class TransposeOfMatrix {
    public static void main(String[] args) {
        

        int matrix[][]={{2,3,7,9,0},{5,6,8,9,7}};

        int row=matrix.length;
        int col=matrix[0].length;

        //Display original matrix
        printMatrix(matrix);
        System.out.println();

        //Transpose of matrix
        int[][]transpose=new int [col][row];
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                transpose[j][i]=matrix[i][j];
            }

        }

        printMatrix(transpose);
    }

    public static void printMatrix(int arr[][])
    {
        System.out.println("The matrix is:");

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
