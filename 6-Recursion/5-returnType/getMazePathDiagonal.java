import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.print(getMazePathDiagonal(1,1,3,3));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePathDiagonal(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
             ArrayList<String> base = new ArrayList<>();
             base.add("");
             return base;
        }
        ArrayList<String> myAns = new ArrayList<>();
        if(sc + 1 <= dc){
            ArrayList<String> horizontal = getMazePathDiagonal(sr,sc + 1,dr,dc);
            for(String s : horizontal){
                myAns.add("h" + s);
            }
        }
        if(sr + 1 <= dr){
            ArrayList<String> vertical = getMazePathDiagonal(sr +1,sc,dr,dc);
            for(String s : vertical){
                myAns.add("v" + s);
            }
        }
        if(sr + 1 <= dr && sc + 1 <= dc){
            ArrayList<String> diagonal = getMazePathDiagonal(sr +1,sc,dr,dc);
            for(String s : diagonal){
                myAns.add("d" + s);
            }
        }
        return myAns;
    }

}