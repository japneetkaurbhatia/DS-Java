import java.io.*;
import java.util.*;

public class Main {

   public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // write your code here
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        System.out.print(minOfArray(arr,0));
    }


    public static int minOfArray(int[] arr, int idx){
        if(idx == arr.length) return (int)-1e9;
        return Math.min(arr[idx],minOfArray(arr,idx+1));
        // return 0;
    }

}