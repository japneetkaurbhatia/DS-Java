public class l001fibo {
    //print fn
    public static void print(int[] arr) {
        for(int ele : arr)
            System.out.print(ele + " ");
        System.out.println();
    }

    public static void print2D(int[][] arr) {
        for(int[] ele : arr)
            System.out.print(ele);
        System.out.println();
    }

    //basic code
    public static int fibo_(int n) {
        if(n <= 1){
            return 1;
        } 
        int ans = fibo_(n - 1) + fibo_(n - 2);
        return ans;
    }

    // memoization
    // size of int[] dp is range of n varies [0,n]
    // dp = n + 1
    public static int fibo_memo(int n, int[] dp) {
        if(n <= 1){
            return dp[n] = n;
        } 

        if(dp[n] != 0) return dp[n];

        int ans = fibo_memo(n - 1,dp) + fibo_memo(n - 2, dp);
        return dp[n] = ans;
    }

    // observation
    // ans at any point depends on last two points ans 
    // hence for loop is from left to right

    //tabulation
    // -> in memoization code 
    //     1. loop
    //     2. return to continue;
    //     3. if(dp[n] != 0) remove
    //     4. rec call to dp array call
    public static int fibo_dp(int N, int[] dp) {
        for(int n = 0; n <= N; n++) {
            if(n <= 1){
                dp[n] = n;
                continue;
            } 

            int ans = dp[n - 1] + dp[n - 2];
            dp[n] = ans;
        }
        return dp[N];
    }

    //further optimization
    public static int fibo_opti(int n) {
        int a = 0, b = 1;
        for(int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        return a;
    }

    public static void fibo() {
        int n = 6;
        int[] dp = new int[n + 1];
        fibo_memo(n,dp);
        print(dp);
        System.out.println("*****");
        fibo_dp(n,dp);
        print(dp);
        System.out.println("*****");
        System.out.print(fibo_opti(n));
    }

    public static void main(String[] args) {
        fibo();
    }
}