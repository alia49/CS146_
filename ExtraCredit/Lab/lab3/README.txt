1. 10000000000n^2 vs n^3:
2. n^2 log(n) vs (log(n))^10
3. n log(n) vs 2 squr(log(n))
4. 2^n vs 2^2n

isPrime(n):
  for i from 2 to n:
    if nmodulo i is 0:
      return false
    return true

Best case is when n is even, and larger than 2. In this case, the function immediately returns false after just one iteration, which is O(1)

Worst Case occurs when n is prime or a product of large primes. The function will have to iterate through all numbers from 2 up to n, making it O(n)

Average Case is tricky without a distribution for n, ubut if we consider n to be a uniformly random number, then on average, it will have factors near its square root. However since we check all numbers up to n, we can approximate the average case to be O(n), although techincally, it would be less due to the probability of hitting a factor earlier 

Time Complexity of the 'isPrime' function is O(n) for the worst and average case. This is because it potentially checks every number from 2 up to n to cnofirm if n is prime 
