import java.io.*;
import java.util.*;

public class Solution {
    
    public static String moveChar(String str,int i, char mch){
        if(i == str.length())  return "";
        char ch = str.charAt(i);
        
        String res = moveChar(str,i+1,mch);
        if(ch != mch)  return ch + res;
        else return res + ch;
    }
    
    public static void moveCharWayUp(String str,int i,String ans1, String ans2, char mch){
        if(i == str.length()){
            System.out.println(ans1 + ans2);
            return;
        }
        
        char ch = str.charAt(i);
        if(ch != mch)  moveCharWayUp(str,i + 1,ans1 + ch,ans2,mch);
        else moveCharWayUp(str,i + 1,ans1,ans2 + ch,mch);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char ch = scn.next().charAt(0);
        int i = scn.nextInt();
        String ans = moveChar(str,0,ch);
        System.out.println(ans.charAt(i));
        moveCharWayUp(str,0,"","",ch);
    }
}
// https://www.hackerrank.com/contests/pepdec62017/challenges/pep-java-7recursion-22movecharacters