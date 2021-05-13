import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.print(getMazePath(1,1,3,3));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
             ArrayList<String> base = new ArrayList<>();
             base.add("");
             return base;
        }
        ArrayList<String> myAns = new ArrayList<>();
        if(sc + 1 <= dc){
            ArrayList<String> horizontal = getMazePath(sr,sc + 1,dr,dc);
            for(String s : horizontal){
                myAns.add("h" + s);
            }
        }
        if(sr + 1 <= dr){
            ArrayList<String> vertical = getMazePath(sr +1,sc,dr,dc);
            for(String s : vertical){
                myAns.add("v" + s);
            }
        }
        return myAns;
    }

}