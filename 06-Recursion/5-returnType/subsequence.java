import java.io.*;
import java.util.*;

public class Main {
    
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String str = scn.nextLine();
         System.out.println(gss(str));
         System.out.println(gss1(str,0));
         gss2(str,0,new StringBuilder());
         gss3(str,0,"");
    }


    //rt1
    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> recAns = gss(ros); //empty
        ArrayList<String> myAns = new ArrayList<>(recAns);
        for(String s : recAns) myAns.add(ch + s);
        return myAns;
    }
    
    //rt 2
    public static ArrayList<String> gss1(String str, int i) {
        if(i == str.length()){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> recAns = gss1(str, i+1); //empty
        ArrayList<String> myAns = new ArrayList<>(recAns);
        char ch = str.charAt(i);
        for(String s : recAns) myAns.add(ch + s);
        return myAns;
    }
    
    //using stringBuilder
    public static void gss2(String str, int i, StringBuilder ans) {
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        
        ans.append(str.charAt(i));
        gss2(str,i+1,ans);
        ans.deleteCharAt(ans.length()-1);
        gss2(str,i+1,ans);
    }
    
    //recursion
    public static void gss3(String str, int i, String ans) {
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        
       gss3(str,i+1,ans);
       gss3(str,i+1,ans + str.charAt(i));
    }
}