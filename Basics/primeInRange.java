import java.util.*;

public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static boolean isPrime_(int n){
        for(int i = 2; i*i <= n; i++){
            if(n%i == 0)  
            return false; 
        }
        return true;
    }
    public static void isPrime(int low, int high){
        for(int i = low; i <= high; i++){
            if(isPrime_(i))  
                System.out.println(i);
        }
    }
    public static void main(String[] args) {
        // write your code here
        int n1 = scn.nextInt();
        int n2= scn.nextInt();
        isPrime(n1,n2);
    }
}