import java.io.*;
import java.util.*;

public class Main {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val: a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void swap(int[] arr, int si,int ei){
        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;
    }
    public static void reverse(int[] arr, int si,int ei){
        while(si<ei){
            swap(arr,si++,ei--);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        reverse(a,0,n-1);
        display(a);
    }

}