import java.io.*;
import java.util.*;

public class Main {
    public static void solution(String str) {
        ArrayList<String> ans = new ArrayList<>();
        ans.add("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            ArrayList<String> myAns = new ArrayList<>();

            for (String s : ans) {
                for (int j = 0; j <= s.length(); j++) {
                    myAns.add(s.substring(0, j) + ch + s.substring(j));
                }
            }

            ans = myAns;
        }

        System.out.println(ans);
    }

// 	public static void solution(String str){
// 		// write your code here
// 		ArrayList<String> ans = new ArrayList<>();
// 		ans.add(str.charAt(0)+"");
// 		for(int i = 1; i < str.length();i++){
// 		    char ch = str.charAt(i);
// 		    ArrayList<String> smallAns = new ArrayList<>();
// 		    for(String s : ans){
// 		        for(int j = 0; j < str.length();j++){
// 		            String ns = str.substring(0,j) + ch + str.substring(j);
// 		            smallAns.add(ns);
// 		        }
// 		    }
// 		    ans =smallAns;
		    
// 		}
// 		System.out.println(ans);
// 	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}