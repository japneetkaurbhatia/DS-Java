import java.io.*;
import java.util.*;

public class Main {

public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
int n = 5;
int m = 5;
printRectangle(1,1,1,n,m);
    }

    public static void printRectangle(int cst, int nst, int nor, int n, int m) {
        if(nor == n+1) return;
        if(cst == nst + 1){
            System.out.println();
            printRectangle(1, nst+1, nor + 1, n , m);
            return;
        }
        System.out.print("*");
        printRectangle(cst + 1, nst, nor, n , m);
    }

}