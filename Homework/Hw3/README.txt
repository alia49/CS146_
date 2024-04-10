Function MultiplyMatrices(A, B):
    If the number of columns in A is not equal to the number of rows in B:
        Raise an Error "Matrix multiplication is not defined."

    Set rows_A to the number of rows in A
    Set cols_A to the number of columns in A
    Set cols_B to the number of columns in B

    Create a result matrix with dimensions rows_A x cols_B filled with zeros

    For i from 0 to rows_A-1:
        For j from 0 to cols_B-1:
            Set sum to 0
            For k from 0 to cols_A-1:
                Increment sum by A[i][k] * B[k][j]
            Set result[i][j] to sum

    Return result

End Function
