import java.io.*;
import java.util.*;

public class Main {

    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        System.out.print(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
         if(n <= 0){
             ArrayList<String> base = new ArrayList<>();
             if(n == 0) base.add("");
             return base;
        }
        ArrayList<String> myAns = new ArrayList<>();
        // for(int jump = 1; jump <= n; jump++){
            ArrayList<String> horizontal = getStairPaths(n-1);
            for(String s : horizontal){
                myAns.add(1 + s);
            }
            ArrayList<String> horizontal2 = getStairPaths(n-2);
            for(String s : horizontal2){
                myAns.add(2 + s);
            }
            ArrayList<String> horizontal3 = getStairPaths(n-3);
            for(String s : horizontal3){
                myAns.add(3 + s);
            // }
        }
        
       
        
       
        return myAns;
    }

}