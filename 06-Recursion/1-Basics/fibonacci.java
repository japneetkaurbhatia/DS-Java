import java.io.*;
import java.util.*;

public class Main {

    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // write your code here
         int n = scn.nextInt();
         System.out.print(fibo(n));
    }

    public static int fibo(int n){
        if(n <= 1) return n;
        return fibo(n-1) + fibo(n-2);
    }

}