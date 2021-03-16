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
  
  public static void printDigits(int n){
      int len = countDigits(n);
      int p = 1;
      while(len-- > 1){
          p *= 10;
      }
      while(p != 0){
          System.out.println(n/p);
          n %= p;
          p /= 10;
      }
  }
    
    public static void main(String[] args) {
      // write your code here
      int n = scn.nextInt();
    printDigits(n);
     }
    }