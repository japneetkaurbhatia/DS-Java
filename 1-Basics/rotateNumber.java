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
       public static int rotateNumber(int n, int r){
           int len = countDigits(n);
           r = (r%len+len)%len;
           int div = 1;
           int mul = 1;
           for(int i = 1; i <= len; i++){
               if(i<=r) div *= 10;
               else mul *= 10;
           }
           int a = n%div;
           int b = n/div;
           return a*mul+b;
       }
   
   public static void main(String[] args) {
     // write your code here  
     int n = scn.nextInt();
     int k = scn.nextInt();
     System.out.println(rotateNumber(n,k));
    }
   }