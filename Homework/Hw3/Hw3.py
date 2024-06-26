def Hw3(A, B):
    if len(A[0]) != len(B):
        raise ValueError("Matrix multiplication is not defined.")
    
    rows_A = len(A)
    cols_A = len(A[0])
    cols_B = len(B[0])
    result = [[0 for _ in range(cols_B)] for _ in range(rows_A)]
    
    for i in range(rows_A):
        for j in range(cols_B):
            for k in range(cols_A):
                result[i][j] += A[i][k] * B[k][j]
    
    return result

# Example usage:
A = [
    [1, 2],
    [3, 4]
]
B = [
    [5, 6],
    [7, 8]
]

result = Hw3(A, B)

# Printing the result
for row in result:
    print(' '.join(map(str, row)))
