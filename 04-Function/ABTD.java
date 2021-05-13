// import java.util.Scanner;

// public class BTD{
//     public static Scanner scn = new Scanner(System.in);
//     public static long binaryToAnyBase(int n, int b){
//         long res =0, pow = 1;
//         while(n > 0){
//             int rem = n % 10;
//             n /= 10;
//             res += rem*pow;
//             pow *= b; 
//         }
//         return res;
//     }
//     public static void main(String[] args){
//         System.out.print(binaryToDecimal(scn.nextInt(),scn.nextInt()));
//     }
// }

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      // write your code here
      int res =0, pow = 1;
        while(n > 0){
            int rem = n % 10;
            n /= 10;
            res += rem*pow;
            pow *= b; 
        }
        return res;
   }
  }