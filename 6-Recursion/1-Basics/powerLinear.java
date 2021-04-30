import java.io.*;
import java.util.*;

public class Main {

    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // write your code here
         int x = scn.nextInt();
         int n = scn.nextInt();
         System.out.print(power(x,n));
    }

    public static int power(int x, int n){
        return n == 0 ? 1 : x * power(x,n-1);
    }

}