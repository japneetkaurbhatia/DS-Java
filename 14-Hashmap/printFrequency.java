import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // write your code here
        String str = scn.nextLine();
        printFrequency(str);
    }
    
    public static void printFrequency(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            // if(map.containsKey(ch))  map.put(ch,map.get(ch)+1);
            // else map.put(ch,1);
            // or
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }

}