import java.io.*;
import java.util.*;

public class Solution {
    
    public static long noToStr(String str,int idx,int pow){    
        if(idx == -1) return 0;
        long recAns = noToStr(str,idx-1,pow * 10);
        return recAns + (str.charAt(idx) - '0') * pow;
    } 

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int div = scn.nextInt();
        System.out.println(noToStr(str,str.length()-1,1)/div);
    }
}


// https://www.hackerrank.com/contests/pepdec62017/challenges/pep-java-7recursion-17numbertostring