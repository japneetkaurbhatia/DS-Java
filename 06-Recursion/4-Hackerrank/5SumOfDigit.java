// https://www.hackerrank.com/contests/pepdec62017/challenges/pep-java-7recursion-16sumofdigitinstring/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static Scanner scn = new Scanner(System.in);
     
    public static void main(String[] args) throws Exception {
        // write your code here
        String s = scn.nextLine();
        System.out.print(sumOfDigit(s,0));
    }
    
    public static int sumOfDigit(String s, int si){
        if(si == s.length()) return 0;
        int recAns = sumOfDigit(s,si+1);
        return (recAns + s.charAt(si) - '0');
    }
}