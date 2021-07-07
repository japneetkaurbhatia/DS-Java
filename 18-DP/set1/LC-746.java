class Solution {
    public int minCostClimbingStairs_memo(int[] cost, int n, int[] dp) {
        if(n <= 1) {
            return dp[n] = cost[n];
        }
        
        if(dp[n] != 0) return dp[n];
        
        int minCostOfStepOne = minCostClimbingStairs_memo(cost, n-1, dp);
        int minCostOfStepTwo = minCostClimbingStairs_memo(cost, n-2, dp);
        
        int ans = Math.min(minCostOfStepOne, minCostOfStepTwo) + ((n != cost.length) ? cost[n] : 0);
        
        return dp[n] = ans;
    }
    
    public int minCostClimbingStairs_dp(int[] cost, int N, int[] dp) {
        for(int n = 0; n <= N; n++) {
            if(n <= 1) {
                dp[n] = cost[n];
                continue;
            }
                
            int minCostOfStepOne = dp[n - 1]; //minCostClimbingStairs_memo(cost, n-1, dp);
            int minCostOfStepTwo = dp[n - 2]; //minCostClimbingStairs_memo(cost, n-2, dp);
        
            int ans = Math.min(minCostOfStepOne, minCostOfStepTwo) + ((n != cost.length) ? cost[n] : 0);
        
            dp[n] = ans;
        }
        return dp[N];
    }
    
    public int minCostClimbingStairs_opti(int[] cost, int N) {
        int a = cost[0] , b = cost[1];
        for(int i = 2; i <= N; i++) {
            int minVal = Math.min(a,b) + ((i != cost.length) ? cost[i] : 0);
            a = b;
            b = minVal;
        }
        return b;
    }
    
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        // int ans = minCostClimbingStairs_memo(cost, n, dp);
        // int ans = minCostClimbingStairs_dp(cost, n, dp);
        int ans = minCostClimbingStairs_opti(cost, n);
        return ans;
    }
}