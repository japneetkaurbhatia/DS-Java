 public static int friendsPairing_memo(int n, int[] dp) {
        if (n <= 1) {
            return dp[n] = 1;
        }

        if (dp[n] != 0)
            return dp[n];

        int single = friendsPairing_memo(n - 1, dp);
        int pairup = friendsPairing_memo(n - 2, dp) * (n - 1);

        return dp[n] = single + pairup;
    }

    public static int friendsPairing_dp(int N, int[] dp) {
        for (int n = 0; n <= N; n++) {
            if (n <= 1) {
                dp[n] = 1;
                continue;
            }

            int single = dp[n - 1];// friendsPairing_memo(n - 1, dp);
            int pairup = dp[n - 2] * (n - 1);// friendsPairing_memo(n - 2, dp) * (n - 1);

            dp[n] = single + pairup;
        }
        return dp[N];
    }

    public static int frindsPairing_Opti(int n) {
        int a = 1, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = b + a * (i - 1);
            a = b;
            b = sum;
        }

        return b;
    }

    public static void frindsPairing() {
        int n = 11;
        int[] dp = new int[n + 1];

        System.out.println(friendsPairing_dp(n, dp));
        print(dp);

        System.out.println(frindsPairing_Opti(n));
    }