import java.util.*;
    
    public class Main{
     public static Scanner scn = new Scanner(System.in);
     public static int lcm(int a, int b,int gcd){
         return ((a*b)/gcd);
     }
      public static int gcd(int n1, int n2){
          int divisor = n1;
          int dividend = n2;
          int rem= 0;
         while(dividend % divisor != 0){
             rem = dividend % divisor;
             dividend = divisor;
             divisor = rem;
         }
         return divisor;
      }
      public static void main(String[] args) {
      // write your code here
      int n1 = scn.nextInt();
     int n2 = scn.nextInt();
     int g = gcd(n1,n2);
     System.out.println(g);
     int l = lcm(n1,n2,g);
     System.out.println(l);
     }
    }