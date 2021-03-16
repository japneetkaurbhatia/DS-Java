import java.util.*;
  
  public class Main{
      public static Scanner scn = new Scanner(System.in);
  public static int countDigits(int n){
      int count = 0;
      while(n != 0){
          count++;
          n /= 10;
      }
      return count;
  }
  public static void main(String[] args) {
    // write your code here 
    int n = scn.nextInt();
    System.out.print(countDigits(n));
   }
  }