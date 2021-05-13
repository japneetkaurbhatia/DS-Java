import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
        int borrow = 0;
       int res = 0;
       int pow = 1;
       while(n1>0 || n2>0){
           int r1 = n1%10;
           int r2 = n2%10;

           n1 /= 10;
           n2 /= 10;

           int ans = r2-r1+borrow;
           if(ans<0){
               ans += b;
               borrow = -1;
           }else{
               borrow = 0;
           }
           res += ans*pow;
           pow *= 10;
       }
       return res;
   }
  
  }