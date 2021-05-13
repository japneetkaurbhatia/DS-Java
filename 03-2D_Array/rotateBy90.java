import java.io.*;
import java.util.*;

public class Main {
    
    public static Scanner scn = new Scanner(System.in);
    
    public static void input(int[][] arr){
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }
    
    public static void rotate(int[][] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        int c1 = 0, c2 = n-1;
        while(c1 < c2){
            for(int r = 0; r < n; r++){
                int e1 = arr[r][c1];
                int e2 = arr[r][c2];
                
                arr[r][c1] = e2;
                arr[r][c2] = e1;
            }
            c1++; c2--;
        }
    }

    public static void main(String[] args) throws Exception {
        // write your code here
         int n = scn.nextInt();
        int[][] arr = new int[n][n];
        input(arr);
        rotate(arr);
        display(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}