import java.io.*;
import java.util.*;

public class Solution {

    public static String removeDuplicates(String str){
        if(str.length() == 1)  return str;
        char ch = str.charAt(0);
        
        String res = removeDuplicates(str.substring(1));
        if(ch != res.charAt(0))  return ch + res;
        else return res;
    }
    
    public static void removeDuplicatesWayUp(String str,int i, String ans){
        if(i == str.length()-1){
            System.out.println(ans + str.charAt(str.length()-1));
            return;
        }
        
        char ch = str.charAt(i);
        if(ch == str.charAt(i+1))  removeDuplicatesWayUp(str,i + 1,ans);
        else removeDuplicatesWayUp(str,i + 1,ans + ch);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int i = scn.nextInt();
        String ans = removeDuplicates(str);
        System.out.println(ans.charAt(i));
        removeDuplicatesWayUp(str,0,"");
    }
        
}

// https://www.hackerrank.com/contests/pepdec62017/challenges/pep-java-7recursion-21removeadjacentduplicates/submissions/code/1330967701