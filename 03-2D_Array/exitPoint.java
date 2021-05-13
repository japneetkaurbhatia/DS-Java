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

public static void exitPoint(int[][] arr, int row, int col){
    int i = 0, j = 0, d = 0;
    while(true){
        d = (d + arr[i][j]) % 4;
        if(d == 0){     //East
            j++;
            if(j == col){
                System.out.print(i + "\n" + (j-1));
                break;
            }
        }
        else if(d == 1){    //South
            i++;
            if(i == row){
                System.out.print((i-1) + "\n" + j);
                break;
            }
        }
        else if(d == 2){    //West
            j--;
            if(j == -1){
                System.out.print(i + "\n" + (j+1));
                break;
            }
        }
         else{
            i--;
            if(i == -1){    //North
                System.out.print((i+1) + "\n" + j);
                break;
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
    exitPoint(arr, n, m);
 }

}