import java.io.*;
import java.util.*;

public class Main{
    public static Scanner scn = new Scanner(System.in);

public static void saddlePoint(int[][] arr){
   int n = arr.length;
   int m = arr[0].length;
   
   for(int r = 0; r < n; r++){
       int c = 0;
       int min = (int)1e8;
       
       for(int j = 0; j < m; j++){
           if(arr[r][j] < min){
               min = arr[r][j];
               c = j;
           }
       }
       
       boolean saddlePoint = true;
       
       for(int i = 0; i < n; i++){
           if(arr[i][c] > min){
               saddlePoint = false;
               break;
           }
       }
       
       if(saddlePoint){
           System.out.print(min);
           return;
       }
   }
   
   System.out.print("Invalid input");
}

public static void main(String[] args) throws Exception {
    // write your code here
    int n = scn.nextInt();
    int[][] arr = new int[n][n];
    for(int i = 0; i < n ; i++){
        for(int j = 0; j < n; j++){
            arr[i][j] = scn.nextInt();
        }
    }
    saddlePoint(arr);
 }
}