import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.print(getMazePathDiagonal(0,0,n-1,m-1));
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
        for(int jump = 1; sc + jump <= dc; jump++){
            ArrayList<String> horizontal = getMazePathDiagonal(sr,sc + jump,dr,dc);
            for(String s : horizontal){
                myAns.add("h" + jump + s );
            }
        }
        for(int jump = 1; sr + jump <= dr; jump++){
            ArrayList<String> vertical = getMazePathDiagonal(sr +jump,sc,dr,dc);
            for(String s : vertical){
                myAns.add("v" + jump + s );
            }
        }
        for(int jump = 1; sc + jump <= dc&& sr + jump <= dr; jump++){
            ArrayList<String> diagonal = getMazePathDiagonal(sr + jump, sc+ jump,dr,dc);
            for(String s : diagonal){
                myAns.add("d" + jump + s);
            }
        }
        return myAns;
    }

}