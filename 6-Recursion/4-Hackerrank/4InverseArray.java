// https://www.hackerrank.com/contests/pepdec62017/challenges/pep-java-7recursion-13inversearray/problem

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
        inverseArray(arr,0);
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ") ;
        System.out.println();
        System.out.print(arr[s]);
    }
    
    public static void inverseArray(int[] arr, int idx){
        if(idx == arr.length) return;
        int val = arr[idx];        
        inverseArray(arr,idx+1);
        arr[val] = idx;
    }
}