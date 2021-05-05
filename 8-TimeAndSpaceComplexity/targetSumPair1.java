import java.io.*;
import java.util.*;

public class Main {

  public static void targetSumPair(int[] arr, int target){
    //write your code here
    targetSumPair(arr,target,0,arr.length-1);
  }
  
   public static void targetSumPair(int[] arr, int data, int si, int ei){
       Arrays.sort(arr);
       while(si < ei){
           int sum = arr[si]+arr[ei];
           if(sum > data)   ei--;
           else if(sum < data)   si++;
           else{
               System.out.println(arr[si] + ", " + arr[ei]);
               si++; ei--;
           }
       }
   }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    targetSumPair(arr,target);
  }

}