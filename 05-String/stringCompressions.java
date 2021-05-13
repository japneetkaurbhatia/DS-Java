import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		// write your code here
		if(str.length() == 0 ) return "";
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		int i = 1;
		while(i < str.length()){
		    if(str.charAt(i) != str.charAt(i-1))
		       sb.append(str.charAt(i));
		    i++;
		}
		return sb.toString();
	}

	public static String compression2(String str){
		// write your code here
		if(str.length()==0) return "";
        StringBuilder sb = new StringBuilder();
        char prevChar = str.charAt(0);
        int i = 1;
        while(i <= str.length()){
            int count = 1;
            while(i < str.length() && prevChar == str.charAt(i)){
                count++;
                prevChar = str.charAt(i++);
            }
            sb.append(prevChar);
            if(count > 1)  sb.append(count);
            if(i==str.length())
               break;
            prevChar = str.charAt(i++);
        }
        return sb.toString();
	}
	
	public static String compression3(String str){
	    int[] freq = new int[26];
	    for(int i = 0; i < str.length(); i++){
	        freq[str.charAt(i) - 'a']++;
	    }
	    StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < freq.length; i++){
	        if(freq[i] > 0){
	            sb.append((char)(i + 'a'));
	            sb.append(freq[i]);
	        }
	    }
	    return sb.toString();
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
		System.out.println(compression3(str));
	}

}


// i/p : abaabbbccddeffghhh
// o/p : ababcdefgh
//       aba2b3c2d2ef2gh3
//       a3b4c2d2e1f2g1h3