import java.util.*;
  
  public class Main{
      public static Scanner scn = new Scanner(System.in);
      public static boolean isPythagorean(int a, int b, int c){
          return (a*a + b*b == c*c || c*c + b*b == a*a || a*a + c*c == b*b);
      }
  public static void main(String[] args) {
    // write your code here  
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    int n3 = scn.nextInt();
    System.out.print(isPythagorean(n1,n2,n3));
   }
  }