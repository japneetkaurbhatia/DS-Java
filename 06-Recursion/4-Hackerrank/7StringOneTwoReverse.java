import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        System.out.print(reverseTwoString(s1,0,s2,s2.length()-1));
    }
    
    public static boolean reverseTwoString(String s1,int i,String s2,int j){
        if(s1.length() != s2.length()) return false;
        if(j == -1) return true;
        if(s1.charAt(i) != s2.charAt(j)) return false;
        return reverseTwoString(s1,i+1,s2,j-1);
    }
}

// https://www.hackerrank.com/contests/pepdec62017/challenges/pep-java-7recursion-18stringonetwoarereverse/submissions/code/1330961814