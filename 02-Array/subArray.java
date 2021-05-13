import java.io.*;
import java.util.*;

public class Main{
    
public static Scanner scn = new Scanner(System.in);
 
public static void SubArray(int[] arr){
    int n = arr.length;
    for(int i = 0; i < n; i++){
        for(int j = i; j < n; j++){
            for(int k = i; k <= j; k++){
                System.out.print(arr[k] + "\t");
            }
            System.out.println();
        }
    }
}

public static void main(String[] args) {
    // write your code here
    int n = scn.nextInt();
    int[] ar = new int[n];
    for(int i = 0; i < n; i++)    {
        ar[i] = scn.nextInt();
    }
    SubArray(ar);
 }

}