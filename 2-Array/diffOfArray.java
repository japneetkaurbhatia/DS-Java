import java.io.*;
import java.util.*;

public class Main{
    public static void diffOfTwoArray(int[] arr1,int[] arr2){
        int p = arr1.length;
        int q = arr2.length;
        int n = p;
        int[] ans = new int[n];
        int k = n - 1;
        int borrow = 0;
        
        int i = p-1;
        int j = q-1;
        while(k>=0){
            int num = borrow;
            if(i >= 0) num+= arr1[i--];
            if(j >= 0) num-= arr2[j--];
            if(num<0){
                num += 10;
                borrow = -1;
            }else{
                borrow = 0;
            }
            ans[k--] = num;
        }
        
        boolean flag = false;
        for(int t = 0; t < ans.length; t++)
        {if(!flag && ans[t]==0) continue;
            System.out.println(ans[t]);
            flag = true;
        }
        
    }
public static Scanner scn = new Scanner(System.in);
public static void main(String[] args) throws Exception {
    // write your code here
    int n1 = scn.nextInt();
    int[] arr1 = new int[n1];
    for(int i = 0; i < arr1.length; i++)
        arr1[i] = scn.nextInt();
    
    int n2 = scn.nextInt();
    int[] arr2 = new int[n2];
    for(int i = 0; i < arr2.length; i++)
        arr2[i] = scn.nextInt();
    
    diffOfTwoArray(arr2,arr1);
 }

}