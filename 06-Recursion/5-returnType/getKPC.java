import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String s = scn.nextLine();
        System.out.println(getKPC(s));
    }
    
    
    public static ArrayList<String> getKPC(String str) {
        if(str.length()== 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz" };
        
        char ch = str.charAt(0);
        int codeIdx = ch - '0';
        String code = codes[codeIdx];
        ArrayList<String> smallAns = getKPC(str.substring(1));
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i < code.length();i++){
            for(String s : smallAns){
                ans.add(code.charAt(i) + s);
            }
        }
        return ans;
        
    }

}