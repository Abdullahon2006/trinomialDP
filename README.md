# Trinomial Coefficient Calculator (Dynamic Programming)

## What This Program Does

This Java program calculates trinomial coefficients efficiently using dynamic programming. It solves the same problem as the brute-force version but works much faster for larger numbers.

## Key Improvements Over Brute-Force

- Uses dynamic programming to store intermediate results
- Avoids recalculating the same values repeatedly
- Can handle much larger inputs (n up to 100+)
- Runs in polynomial time instead of exponential time

## How to Use

1. Compile the program:
   ```bash
   javac TrinomialDP.java
   ```

2. Run with two numbers:
   ```bash
   java TrinomialDP n k
   ```

## Example Calculations

```bash
$ java TrinomialDP 3 0
7

$ java TrinomialDP 30 0
18252025766941

$ java TrinomialDP 40 0
934837217271732457
```

## Implementation Details

1. Creates a 2D array to store computed values
2. Fills the array using the same recurrence relation:
   - T(n,k) = T(n-1,k-1) + T(n-1,k) + T(n-1,k+1)
3. Handles edge cases:
   - T(0,0) = 1
   - T(n,k) = 0 when |k| > n

## Performance Benefits

- Calculates T(40,0) instantly (takes forever with brute-force)
- Uses O(n²) memory
- Runs in O(n²) time

## Practical Applications

Same as brute-force version, but now practical for real-world problems:
- Statistical modeling
- Probability calculations
- Financial mathematics
- Large-scale combinatorial problems

## Limitations

- Still limited by Java's maximum array size
- For extremely large n (1000+), may need more memory optimization
