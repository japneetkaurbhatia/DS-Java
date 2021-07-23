import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int ans = largestArea(a);
    System.out.print(ans);
    // code
 }
 
  public static int[] NGOR(int[] arr) {
        int n = arr.length;
        LinkedList<Integer> st = new LinkedList<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for (int i = 0; i < n; i++) {
            while (st.size() != 0 && arr[st.getFirst()] < arr[i]) {
                ans[st.removeFirst()] = arr[i];
            }

            st.addFirst(i);
        }
        return ans;
    }

    public static int[] NGOL(int[] arr) {
        int n = arr.length;
        LinkedList<Integer> st = new LinkedList<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for (int i = n - 1; i >= 0; i--) {
            while (st.size() != 0 && arr[st.getFirst()] < arr[i]) {
                ans[st.removeFirst()] = arr[i];
            }

            st.addFirst(i);
        }
        return ans;
    }

    public static int[] NSOR(int[] arr) {
        int n = arr.length;
        LinkedList<Integer> st = new LinkedList<>();
        int[] ans = new int[n];
        Arrays.fill(ans, n);

        for (int i = 0; i < n; i++) {
            while (st.size() != 0 && arr[st.getFirst()] > arr[i]) {
                ans[st.removeFirst()] = i;
            }

            st.addFirst(i);
        }
        return ans;
    }

    public static int[] NSOL(int[] arr) {
        int n = arr.length;
        LinkedList<Integer> st = new LinkedList<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for (int i = n - 1; i >= 0; i--) {
            while (st.size() != 0 && arr[st.getFirst()] > arr[i]) {
                ans[st.removeFirst()] = i;
            }

            st.addFirst(i);
        }
        return ans;
    }

    public static int largestArea(int[] arr) {
        int n = arr.length;
        int[] nsol = NSOL(arr);
        int[] nsor = NSOR(arr);

        int area = 0;
        for (int i = 0; i < n; i++) {
            int h = arr[i];
            int w = nsor[i] - nsol[i] - 1;
            area = Math.max(area, h * w);
        }

        return area;
    }
}