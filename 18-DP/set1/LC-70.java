class Solution {
    public int climbStairs_memo(int n, int[] dp) {
        if(n <= 1) 
            return dp[n] = 1;
        
        if(dp[n] != 0)
            return dp[n];
        
        int step = climbStairs_memo(n-1, dp) + climbStairs_memo(n-2, dp);
        
        return dp[n] = step;
    }
    
    public int climbStairs_dp(int N, int[] dp) {
        for(int n = 0; n <= N; n++){
            if(n <= 1) {
                dp[n] = 1;
                continue;
            }
        
            int step = dp[n-1] + dp[n-2];
            dp[n] = step;
        }
        return dp[N];
    }
    
    public int climbStairs_opti(int n) {
        int a = 1, b = 1;
        for(int i = 0; i < n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return a;
    }
    
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        // int ans = climbStairs_memo(n, dp);
        // int ans = climbStairs_dp(n, dp);
        int ans = climbStairs_opti(n);
        return ans;
    }
}