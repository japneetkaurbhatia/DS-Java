import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void input(int[] arr,int n){
        for(int i=0; i <n; i++){
            arr[i] = scn.nextInt();
        }
    }

     public static int firstIdx(int[] arr, int n){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
    }
    public static int lastIdx(int[] arr, int n){
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr,n);
        int data = scn.nextInt();
        System.out.println(firstIdx(arr,data));
        System.out.println(lastIdx(arr,data));
    }

}