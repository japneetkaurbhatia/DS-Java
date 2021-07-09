import java.util.LinkedList;
public class mazePath {
    public static void print(int[] arr) {
        for(int ele : arr)
            System.out.print(ele + " ");
        System.out.println();
    }

     public static void print2D(int[][] arr) {
        for (int[] a : arr) {
            print(a);
        }

        System.out.println();
    }

    public static int mazePath(int sr,int sc,int er,int ec, int[][] dir) {
        if(sr == er && sc == ec)
            return 1;

        int count = 0;
        for(int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if(r >= 0 && c >= 0 && r <= er && c <= ec) {
                count += mazePath(r,c,er,ec,dir);
            }
        }
        return count;
    }    

    public static int mazePath_memo(int sr,int sc,int er,int ec, int[][] dir, int[][] dp) {
        if(sr == er && sc == ec)
            return dp[sr][sc] = 1;

        if(dp[sr][sc] != 0)      return dp[sr][sc];

        int count = 0;
        for(int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if(r >= 0 && c >= 0 && r <= er && c <= ec) {
                count += mazePath_memo(r,c,er,ec,dir,dp);
            }
        }
        return dp[sr][sc] = count;
    }    

    public static int mazePath_dp(int SR,int SC,int er,int ec, int[][] dir, int[][] dp) {
        for(int sr = er; sr >= 0; sr--) {
            for(int sc = ec; sc >= 0; sc--) {
                if(sr == er && sc == ec){
                    dp[sr][sc] = 1;
                    continue;
                }

                int count = 0;
                for(int d = 0; d < dir.length; d++) {
                    int r = sr + dir[d][0];
                    int c = sc + dir[d][1];
                    if(r >= 0 && c >= 0 && r <= er && c <= ec) {
                        count += dp[r][c];
                    }
                }
                dp[sr][sc] = count;
            }
        } 
        return dp[SR][SC];       
    }  

    public static int mazePath_memo_multi(int sr,int sc,int er,int ec, int[][] dir, int[][] dp) {
        if(sr == er && sc == ec)
            return dp[sr][sc] = 1;

        if(dp[sr][sc] != 0)      return dp[sr][sc];

        int count = 0;
        for(int d = 0; d < dir.length; d++) {
            for(int rad = 1; rad <= Math.max(er, ec); rad++){
                int r = sr + rad * dir[d][0];
                int c = sc + rad * dir[d][1];
                if(r >= 0 && c >= 0 && r <= er && c <= ec) {
                    count += mazePath_memo(r,c,er,ec,dir,dp);
                } else
                    break;
            }
        }
        return dp[sr][sc] = count;
    }    

    public static int mazePath_dp_multi(int SR,int SC,int er,int ec, int[][] dir, int[][] dp) {
        for(int sr = er; sr >= 0; sr--) {
            for(int sc = ec; sc >= 0; sc--) {
                if(sr == er && sc == ec){
                    dp[sr][sc] = 1;
                    continue;
                }

                int count = 0;
                for(int d = 0; d < dir.length; d++) {
                    for(int rad = 1; rad <= Math.max(er, ec); rad++){
                        int r = sr + rad * dir[d][0];
                        int c = sc + rad * dir[d][1];
                        if(r >= 0 && c >= 0 && r <= er && c <= ec) {
                            count += dp[r][c];
                        } else
                            break;
                    }
                }
                dp[sr][sc] = count;
            }
        } 
        return dp[SR][SC];       
    }
    
    public static void mazePath() {
        int n = 5, m = 7;
        int[][] dp = new int[n][m];
        int[][] dir = {{1,0}, {0,1}, {1,1}};
        int ans = mazePath(0,0,n-1,m-1,dir);
        System.out.println(ans);
        //one jump
        System.out.println("one");
        System.out.println(mazePath_memo(0,0,n-1,m-1,dir,dp));
        print2D(dp);
        System.out.println(mazePath_dp(0,0,n-1,m-1,dir,dp));
        print2D(dp);
        //multi jump
        System.out.println("multi");
        System.out.println(mazePath_memo_multi(0,0,n-1,m-1,dir,dp));
        print2D(dp);
        System.out.println(mazePath_dp_multi(0,0,n-1,m-1,dir,dp));
        print2D(dp);
    }

    public static void main(String[] args) {
        mazePath();
    }
}