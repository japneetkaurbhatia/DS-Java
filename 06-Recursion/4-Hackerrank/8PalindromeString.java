import java.io.*;
import java.util.*;

public class Solution {
    
    public static Scanner scn = new Scanner(System.in);
    
    public static boolean palinString(String str,int si,int ei){
        if(si >= ei)  return true;
        
        char ch1 = str.charAt(si);
        char ch2 = str.charAt(ei);
        
        int diff1 = ch1 >= 'A' && ch1 <= 'Z' ? ch1 - 'A' : ch1 - 'a';
        int diff2 = ch2 >= 'A' && ch2 <= 'Z' ? ch2 - 'A' : ch2 - 'a';
        
        if(diff1 != diff2) return false;
        
        return palinString(str,si+1,ei-1);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String str = scn.next();
        if(palinString(str,0,str.length()-1))  System.out.println("true");
        else System.out.println("false");
    }
}

// https://www.hackerrank.com/contests/pepdec62017/challenges/pep-java-7recursion-19palindromeofstring/submissions/code/1330962479