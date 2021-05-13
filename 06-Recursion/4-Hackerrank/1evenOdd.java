// https://www.hackerrank.com/contests/pepdec62017/challenges/pep-java-7recursion-1oddandevennumberprinting/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

      public static Scanner scn = new Scanner(System.in);
     
    public static void main(String[] args) throws Exception {
        // write your code here
        int n = scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
         if(n==0) return;
        if(n % 2 != 0) System.out.println(n);
        pdi(n-1);
        if(n % 2 == 0) System.out.println(n);
    }
}