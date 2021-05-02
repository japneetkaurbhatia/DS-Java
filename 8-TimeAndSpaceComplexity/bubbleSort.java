import java.io.*;
import java.util.*;

public class Main {

  public static void bubbleSort(int[] arr) {
    //write your code here
    int n = arr.length;
    int ei = n - 1;
    for(int i = 0; i < n; i++){
        moveToLast(arr,0,ei-i);
    }
  }
  
  public static void moveToLast(int[] arr, int si, int ei){
      for(int i = si+1; i <= ei; i++){
          if(arr[i-1] > arr[i])
            swap(arr,i-1,i);
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



// import java.io.*;
// import java.util.*;

// public class Main {

//   public static void bubbleSort(int[] arr) {
//     //write your code here
//     int n = arr.length;
//     int ei = n - 1;
//     for(int i = 0; i < n; i++){
//         moveToLast(arr,0,ei-i);
//     }
//   }
  
//   public static void moveToLast(int[] arr, int si, int ei){
//       for(int i = si+1; i <= ei; i++){
//         if(isSmaller(arr,i,i-1))
//             swap(arr,i,i-1);
//       }
//   }

//   // used for swapping ith and jth elements of array
//   public static void swap(int[] arr, int i, int j) {
//     System.out.println("Swapping " + arr[i] + " and " + arr[j]);
//     int temp = arr[i];
//     arr[i] = arr[j];
//     arr[j] = temp;
//   }

//   // return true if ith element is smaller than jth element
//   public static boolean isSmaller(int[] arr, int i, int j) {
//     System.out.println("Comparing " + arr[i] + " and " + arr[j]);
//     if (arr[i] < arr[j]) {
//       return true;
//     } else {
//       return false;
//     }
//   }

//   public static void print(int[] arr) {
//     for (int i = 0; i < arr.length; i++) {
//       System.out.println(arr[i]);
//     }
//   }

//   public static void main(String[] args) throws Exception {
//     Scanner scn = new Scanner(System.in);
//     int n = scn.nextInt();
//     int[] arr = new int[n];
//     for (int i = 0; i < n; i++) {
//       arr[i] = scn.nextInt();
//     }
//     bubbleSort(arr);
//     print(arr);
//   }

// }