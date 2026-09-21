//Sparse Matrix is a matrix in which most of the elements are zero
//A matrix is generally considered as sparse if "Number of zeroes greater tan the Number of non zero elements"
public class SparseMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,0},{0,0,3},{0,0,0}};
        int rows=matrix.length;
        int cols=matrix[0].length;
        int zeroCount=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0)
                    zeroCount++;
            }
        }
        int totalElements=rows*cols;
        if(zeroCount>totalElements/2){
            System.out.println("Sparse Matrix");
        }
        else{
            System.out.println("Not a Sparse matrix");
        }
    }
}
