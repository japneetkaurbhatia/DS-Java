import java.io.*;
import java.util.*;

public class Main{
    public static Scanner scn = new Scanner(System.in);

public static void input(int[][] arr){
    for(int i = 0; i < arr.length ; i++){
        for(int j = 0; j < arr[0].length; j++){
            arr[i][j] = scn.nextInt();
        }
    }
}

public static void waveTraversal(int[][] arr, int n, int m){
    for(int j = 0; j < m ; j++){
        if(j%2 == 0){
            for(int i = 0; i < n; i++){
                System.out.println(arr[i][j]);
            }
        }else{
            for(int i = n-1; i >= 0; i--){
                System.out.println(arr[i][j]);
            }
        }
    }
}

public static void main(String[] args) throws Exception {
    // write your code here
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] arr = new int[n][m];
    input(arr);
    waveTraversal(arr, n, m);
 }

}