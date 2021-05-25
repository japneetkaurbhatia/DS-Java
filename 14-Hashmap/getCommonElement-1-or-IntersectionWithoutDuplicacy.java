import java.io.*;
import java.util.*;

public class Main{
public static Scanner scn = new Scanner(System.in);
public static void input(int[] arr, int n){
    for(int i = 0; i < n; i++)
        arr[i] = scn.nextInt();
}
public static void intersectionWithoutDuplicacy(int[] arr1, int[] arr2){
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int ele : arr1)
        map.put(ele,map.getOrDefault(ele,0)+1);
    for(int ele : arr2){
        if(map.containsKey(ele)){
            System.out.println(ele);
            map.remove(ele);
        }
    }
}
public static void main(String[] args) throws Exception {
    // write your code here
    int n1 = scn.nextInt();
    int[] arr1 = new int[n1];
    input(arr1,n1);
    int n2 = scn.nextInt();
    int[] arr2 = new int[n2];
    input(arr2,n2);
    intersectionWithoutDuplicacy(arr1,arr2);
 }

}