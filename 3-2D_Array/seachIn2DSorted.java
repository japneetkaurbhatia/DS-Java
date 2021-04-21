import java.io.*;
import java.util.*;

public class Main {
    
    public static void search(int[][] arr, int data){
        int i = arr.length - 1, j = 0;
      while(i >= 0 && j < arr[0].length){
         if(arr[i][j] == data){
            System.out.println(i + "\n" + j);
            return;
         } else if(arr[i][j] < data){
            j++;
         } else {
            i--;
         }
      }

      System.out.println("Not Found");
    }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[n][n];

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            arr[i][j] = Integer.parseInt(br.readLine());
         }
      }

      int x = Integer.parseInt(br.readLine());

      search(arr,x);
      
   }


}