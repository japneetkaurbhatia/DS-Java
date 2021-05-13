import java.util.Scanner;

public class BTD{
    public static Scanner scn = new Scanner(System.in);
    public static long binaryToDecimal(int n){
        long res =0, pow = 1;
        while(n > 0){
            int rem = n % 10;
            n /= 10;
            res += rem*pow;
            pow *= 2; 
        }
        return res;
    }
    public static void main(String[] args){
        System.out.print(binaryToDecimal(scn.nextInt()));
    }
}