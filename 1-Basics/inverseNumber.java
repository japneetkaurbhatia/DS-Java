import java.util.*;

public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int countDigits(int n){
        int ctr = 0;
        while(n!=0){
            int rem = n%10;
            ctr++;
            n /= 10;
        }
        return ctr;
        }
       public static int inverseNumber(int n){
           int len = countDigits(n);
           int ans= 0;
           for(int i= 1; i <= len; i++){
               int r= n%10;
               n /= 10;
               ans += i * Math.pow(10,r-1);
           }
           return ans;
       }
public static void main(String[] args) {
  // write your code here  
  int n = scn.nextInt();
   System.out.println(inverseNumber(n));
 }
}