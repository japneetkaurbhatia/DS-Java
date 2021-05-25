import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // write your code here
        String str = scn.nextLine();
        posOfAllChar(str);
    }
    
    public static void posOfAllChar(String str){
        HashMap<Character,ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            // if(!map.containsKey(ch))
                // map.put(ch,new ArrayList<>());
            // or
            map.putIfAbsent(ch,new ArrayList<>());
            map.get(ch).add(i);
        }
        for(Character ch : map.keySet())
            System.out.println(ch + " -> " + map.get(ch));
    }

}