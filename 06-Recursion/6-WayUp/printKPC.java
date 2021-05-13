import java.io.*;
import java.util.*;

public class Main {
public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String s = scn.nextLine();
        printKPC(s,"");
    }

    public static void printKPC(String str, String asf) {
        if(str.length()== 0){
            System.out.println(asf);
            return;
        }
        String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz"         };
        
        char ch = str.charAt(0);
        int codeIdx = ch - '0';
        String code = codes[codeIdx];
        
        
        for(int i = 0; i < code.length();i++){
           
                printKPC(str.substring(1),asf + code.charAt(i));
            
        }
        
        // return ans;
    }

}