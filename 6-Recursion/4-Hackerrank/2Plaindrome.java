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
        System.out.print(checkPalindrome(arr,0,n-1));
    }
    
    public static boolean checkPalindrome(int[] arr, int si, int ei){
        if(si >= ei) return true;
        if(arr[si] != arr[ei]) return false;
        
        return checkPalindrome(arr,si+1,ei-1);
    }
}

// https://www.hackerrank.com/contests/pepdec62017/challenges/pep-java-7recursion-11palindrome/problem