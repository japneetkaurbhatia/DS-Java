import java.util.Scanner;
public class functions{
    public static Scanner scn = new Scanner(System.in);
    public static int maxEle(int[] arr){
        int maxEle = (int)-1e9;
        for(int i = 0; i < arr.length; i++){
            if(maxEle < arr[i])
                maxEle = arr[i];
        }
        return maxEle;
    }
    public static int minEle(int[] arr){
        int minEle = (int)1e9;
        for(int i = 0; i < arr.length; i++){
            if(minEle > arr[i])
                minEle = arr[i];
        }
        return minEle;
    }
    public static int findEle(int[] arr, int n){
        int idx = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                idx = i;
                break;
            }
        }
        return idx;
    }
    public static int firstIdx(int[] arr, int n){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
    }
    public static int lastIdx(int[] arr, int n){
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int no = scn.nextInt();
        int[] arr = new int[no];
        for(int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
        int data = scn.nextInt();
        System.out.println(maxEle(arr));
        System.out.println(minEle(arr));
        System.out.println(findEle(arr,data));
        System.out.println(firstIdx(arr,data));
        System.out.println(lastIdx(arr,data));
    }
}