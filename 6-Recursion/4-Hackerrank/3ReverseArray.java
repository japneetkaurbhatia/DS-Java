import java.io.*;
import java.util.*;

public class Solution {

     public static Scanner scn = new Scanner(System.in);
     
    public static void main(String[] args) throws Exception {
        // write your code here
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        
        int s = scn.nextInt();
        reverseArray(arr,0,n-1);
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ") ;
        System.out.println();
        System.out.print(arr[s]);
    }
    
    public static void reverseArray(int[] arr, int si, int ei){
        if(si >= ei) return;
        swapNums(arr, si, ei);        
        reverseArray(arr,si+1,ei-1);
    }
    
    public static void swapNums(int[] arr, int si, int ei){
        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;
    }
}
// https://www.hackerrank.com/contests/pepdec62017/challenges/pep-java-7recursion-12reverseofarray/problem