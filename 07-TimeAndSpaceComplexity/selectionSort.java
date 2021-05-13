import java.io.*;
import java.util.*;

public class Main {

  public static void bubbleSort(int[] arr) {
    //write your code here
    int n = arr.length;
    int ei = n - 1;
    for(int i = 0; i < n; i++){
        moveToStart(arr,i,ei);
    }
  }
  
  public static void moveToStart(int[] arr, int si, int ei){
      for(int i = si; i <= ei; i++){
          if(arr[si] > arr[i])
            swap(arr,si,i);
      }
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

 

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    bubbleSort(arr);
    print(arr);
  }

}