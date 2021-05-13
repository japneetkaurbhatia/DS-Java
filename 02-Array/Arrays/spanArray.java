import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void input(int[] arr,int n){
        for(int i=0; i <n; i++){
            arr[i] = scn.nextInt();
        }
    }

    public static int spanArray(int[] arr){
        int minEle = (int)1e9;
        int maxEle = (int)-1e9;
        for(int i = 0; i < arr.length; i++){
            if(minEle > arr[i])
                minEle = arr[i];
            if(maxEle < arr[i])
                maxEle = arr[i];
        }   
        return maxEle - minEle;
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr,n);
        System.out.println(spanArray(arr));
    }

}