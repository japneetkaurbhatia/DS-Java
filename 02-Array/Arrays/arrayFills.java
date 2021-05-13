import java.util.Scanner;
import java.util.Arrays;
public class arrayFills{
    public static Scanner scn = new Scanner(System.in);
    public static void test1(){
        int n = scn.nextInt();
        int[] arr = new int[n];
        Arrays.fill(arr,5);              
        for(int i = 0; i < arr.length; i++){            
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        test1();
    }
}