import java.io.*;
import java.util.*;

public class Main{

public static Scanner scn = new Scanner(System.in);
public static void input(int[] arr, int n){
    for(int i = 0; i < n; i++)
        arr[i] = scn.nextInt();
}
public static void longestSubsequence(int[] arr){
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int ele : arr){
        map.put(ele,map.getOrDefault(ele,0)+1);
    }
    int sp = 0,maxLen = 0;
    for(int ele : arr){
        if(!map.containsKey(ele))
            continue;
        map.remove(ele);
        int le = ele - 1;
        int re = ele + 1;
        while(map.containsKey(le)){
            map.remove(le);
            le--;
        }
        while(map.containsKey(re)){
            map.remove(re);
            re++;
        }
        int len = re - le - 1;
        if(len > maxLen){
            maxLen = len;
            sp = le + 1;
        }
    }
    for(int i = 0; i < maxLen; i++){
        System.out.println(sp+i);
    }
}
public static void main(String[] args) throws Exception {
    // write your code here
    int n = scn.nextInt();
    int[] arr = new int[n];
    input(arr,n);
    longestSubsequence(arr);
 }

}