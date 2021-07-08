import java.util.LinkedList;
public class diceWays {
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

    public static int boardPath_(int n) {
        if(n == 0)
            return 1;
        int count = 0;
        for(int dice = 1; dice <= 6 && n - dice >= 0; dice++) {
            count += boardPath_(n - dice);
        }
        return count;
    }

    public static int boardPath_memo(int n, int[] dp) {
        if(n == 0)
            return dp[n] = 1;

        if(dp[n] != 0)  return dp[n];

        int count = 0;
        for(int dice = 1; dice <= 6 && n - dice >= 0; dice++) {
            count += boardPath_memo(n - dice, dp);
        }
        return dp[n] = count;
    }

    public static int boardPath_dp(int N, int[] dp) {
        for(int n = 0; n < N; n++){
            if(n == 0){
                dp[n] = 1;
                continue;
            }

            int count = 0;
            for(int dice = 1; dice <= 6 && n - dice >= 0; dice++) {
                count += dp[n - dice];
            }
            dp[n] = count;
        }
        return dp[N];
    }

    public static int boardPath_opti(int n) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(1);
        for(int i = 2; i <= n; i++) {
            if(ll.size() <= 6)
                ll.addLast(ll.getLast() * 2);
            else
                ll.addLast(ll.getLast() * 2 - ll.removeFirst());
        }
        return ll.getLast();
    }
    
    public static void boardPath() {
        int n = 10;
        int[] dp = new int[n + 1];
        System.out.println(boardPath_(n));
        System.out.println(boardPath_memo(n, dp)); 
        print(dp); 
        System.out.println(boardPath_dp(n, dp)); 
        print(dp); 
        System.out.println(boardPath_opti(n)); 
        print(dp);       
    }

    public static void main(String[] args) {
        boardPath();
    }
}