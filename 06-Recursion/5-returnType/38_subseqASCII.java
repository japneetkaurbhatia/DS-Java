import java.io.*;
import java.util.*;

public class Solution {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String str = scn.nextLine();
        System.out.println(gss2(str,0,""));
        System.out.println(gss1(str,0));
        gss0(str,0,"");
         // 
         // 
         // gss2(str,0,"");
    }

        public static void gss0(String str, int i, String ans) {
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        gss0(str,i+1,ans);
        gss0(str,i+1,ans+str.charAt(i));   
        gss0(str,i+1,ans+(int)str.charAt(i));   
    }
    
    // rt 2
    public static ArrayList<String> gss1(String str, int i) {
        if(i == str.length()){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> recAns = gss1(str, i+1); //empty
        ArrayList<String> myAns = new ArrayList<>();
        char ch = str.charAt(i);
        for(String s : recAns){
            myAns.add(s);
            myAns.add(s + ch);
            myAns.add(s + (int)ch);
        } 
        return myAns;
    }
    
    //recursion
    public static int gss2(String str, int i, String ans) {
        if(i == str.length()){
            return 1;
        }
        
       return gss2(str,i+1,ans) + gss2(str,i+1,ans + (int)str.charAt(i)) + gss2(str,i+1,ans + str.charAt(i));
       // return ;
    }
}