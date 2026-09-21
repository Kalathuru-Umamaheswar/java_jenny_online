//A symmetric matrix is a square matrix
public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };
        boolean symmetric = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }
        if (symmetric) {
            System.out.println("Symmetric Matrix");
        } else {
            System.out.println("Not a Symmetric Matrix");
        }
    }
}
