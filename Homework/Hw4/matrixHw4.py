
def matrixHw4(A, B):
    if len(A[0]) != len(B):
        raise ValueError("Matrix multiplication is not defined.")

    rows_A = len(A)
    cols_A = len(A[0])
    cols_B = len(B[0])
    result = [[0] * cols_B for _ in range(rows_A)]
    
    for i in range(rows_A):
        for j in range(cols_B):
            for k in range(cols_A):
                result[i][j] += A[i][k] * B[k][j]
    return result

# Time Complexity: O(n^3) for square matrices of size n.
