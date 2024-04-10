def fib(n):
    if n <= 1:
        return n
    fib_cache = [0, 1] + [0] * (n-1)
    
    for i in range(2, n + 1):
        fib_cache[i] = fib_cache[i - 1] + fib_cache[i - 2]
    
    return fib_cache[n]

# Example: Finding the 9th Fibonacci number
n = 9
print(f"The {n}th Fibonacci number is: {fib(n)}")
