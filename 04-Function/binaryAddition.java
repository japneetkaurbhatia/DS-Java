import java.util.*;
  
  public class binaryAddition{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
    //   int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum( n1, n2);
      System.out.println(d);
   }
  
   public static int getSum( int n1, int n2){
       // write ur code here
       int pow = 1;
       int carry = 0;
       int res = 0;
       while(n1>0 || n2>0 || carry>0){
           int r1 = n1%10;
           int r2 = n2%10;

           n1 /= 10;
           n2 /= 10;

           int sum = r1 + r2 + carry;

           int r = sum%2;
           carry = sum/2;

           res += r*pow;
           pow *= 10;
       }
       return res;
       
   }
  }