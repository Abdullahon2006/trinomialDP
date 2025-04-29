public class TrinomialDP {

    // Returns the trinomial coefficient T(n, k)
    public static long trinomial(int n, int k) {
        // Handle edge cases
        if (n == 0 && k == 0) return 1;
        if (k < -n || k > n) return 0;
        
        // Create DP table
        long[][] dp = new long[n + 1][2 * n + 1];
        dp[0][n] = 1;  // Base case: T(0,0) = 1
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= 2 * n; j++) {
                int currentK = j - n;  // Convert index to k value
                if (currentK < -i || currentK > i) continue;
                
                long sum = 0;
                if (j - 1 >= 0) sum += dp[i - 1][j - 1];  // T(n-1, k-1)
                sum += dp[i - 1][j];                      // T(n-1, k)
                if (j + 1 <= 2 * n) sum += dp[i - 1][j + 1];  // T(n-1, k+1)
                
                dp[i][j] = sum;
            }
        }
        
        return dp[n][k + n];  // Convert k back to index
    }

    // Takes two integer command-line arguments n and k and prints T(n, k)
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        System.out.println(trinomial(n, k));
    }
}