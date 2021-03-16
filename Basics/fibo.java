import java.util.*;
  
  public class Main{
      public static Scanner scn = new Scanner(System.in);
      
  public static void printFibo(int n){
      int a = 0, b = 1, c =0;
      System.out.println(a);
      System.out.println(b);
      for(int i = 0; i < n-2; i++){
          c = a + b;
          System.out.println(c);
          a = b;
          b = c;
      }
  }
  public static void main(String[] args) {
      // write your code here
      int n = scn.nextInt();
      printFibo(n);
   }
  }