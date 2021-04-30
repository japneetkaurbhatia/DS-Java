import java.io.*;
import java.util.*;

public class Main {
    
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String str = scn.nextLine();
        printSS(str,0,"");
    }

    public static void printSS(String str,int i, String ans) {
         if(i == str.length()){
            System.out.println(ans);
            return;
        }
         printSS(str,i+1,ans + str.charAt(i));
       printSS(str,i+1,ans);
    }

}