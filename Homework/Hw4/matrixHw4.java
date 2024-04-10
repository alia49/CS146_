
public class matrixHw4{

    public static int[][] multiply(int[][] A, int[][] B) {
        if (A[0].length != B.length) {
            throw new IllegalArgumentException("Matrix multiplication is not defined.");
        }

        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];
        
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        return result;
    }

    // Time Complexity: O(n^3) for square matrices of size n.
}
