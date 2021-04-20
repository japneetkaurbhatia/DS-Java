import java.util.Scanner;

public class DTB{
    public static Scanner scn = new Scanner(System.in);
    public static long decimalToBinary(int n){
        long res =0, pow = 1;
        while(n > 0){
            int rem = n % 2;
            n /= 2;
            res += rem*pow;
            pow *= 10; 
        }
        return res;
    }
    public static void main(String[] args){
        System.out.print(decimalToBinary(scn.nextInt()));
    }
}