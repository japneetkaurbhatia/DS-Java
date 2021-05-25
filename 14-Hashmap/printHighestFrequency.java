import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // write your code here
        String str = scn.nextLine();
        printHighestFrequency(str);
    }
    
    public static void printHighestFrequency(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char ans = ' ';
        int freq = 0;
        for(Character ch : map.keySet()){
            if(map.get(ch) > freq){
                ans = ch;
                freq = map.get(ch);
            }
        }
        System.out.println(ans);
    }

}