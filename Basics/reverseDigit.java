import java.util.*;
   
   public class Main{
   public static Scanner scn = new Scanner(System.in);
   public static void reverseDigits(int n){
       while(n > 0){
           int res = n % 10;
           System.out.println(res);
           n /= 10;
       }
   }
   public static void main(String[] args) {
     // write your code here  
      int n = scn.nextInt();
      reverseDigits(n);
    }
   }