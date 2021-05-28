import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<Integer> mergeTwo(ArrayList<Integer> list1,ArrayList<Integer> list2){
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, n = list1.size();
        int j = 0, m = list2.size();
        while(i < n && j < m){
            if(list1.get(i) < list2.get(j))
                ans.add(list1.get(i++));
            else
                ans.add(list2.get(j++));
        }
        while(i < n){
            ans.add(list1.get(i++));
        }
        while(j < m){
            ans.add(list2.get(j++));
        }
        return ans;
    }
    
    public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists, int si, int ei){
        if(si == ei)
            return lists.get(si);
        int mid = (si + ei)/2;
        ArrayList<Integer> list1=mergeKSortedLists(lists,si,mid);
        ArrayList<Integer> list2=mergeKSortedLists(lists,mid+1,ei);
        return mergeTwo(list1,list2);
    }
    
   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> rv = new ArrayList<>();

      // write your code here
    rv = mergeKSortedLists(lists,0,lists.size()-1);
      return rv;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(br.readLine());
      ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
      for(int i = 0; i < k; i++){
         ArrayList<Integer> list = new ArrayList<>();

         int n = Integer.parseInt(br.readLine());
         String[] elements = br.readLine().split(" ");
         for(int j = 0; j < n; j++){
            list.add(Integer.parseInt(elements[j]));
         }

         lists.add(list);
      }

      ArrayList<Integer> mlist = mergeKSortedLists(lists);
      for(int val: mlist){
         System.out.print(val + " ");
      }
      System.out.println();
   }

}