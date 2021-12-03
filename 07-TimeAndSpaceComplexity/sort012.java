import java.io.*;
import java.util.*;

public class Main {

  public static void sort012(int[] arr){
    //write your code here
     int n = arr.length;
    int ptr1 = 0, itr = 0, ptr2 = n-1;
    while(itr <= ptr2){
        if(arr[itr] == 0)
            swap(arr,itr++,ptr1++);
        else if(arr[itr] == 2)
            swap(arr,itr,ptr2--);
        else
            itr++;
    }
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * 
 */
public class Solution
{
	public static int  nonRepeatedChar(String compString)
	{
		int  answer = 0;
		// Write your code here
		if(compString.length() == 0)
			return answer;
		if(compString.length() == 1) {
			answer++;
			return answer;
		}
		int[] freqLower = new int[26]; 
		int[] freqUpper = new int[26];
		int[] freqNumeric = new int[10];
		int[] freqSpecial = new int[26];
		for(int i = 0; i < compString.length(); i++) {
			if(compString.charAt(i) >= 'a' && compString.charAt(i) <= 'z')
				freqLower[compString.charAt(i) - 'a']++;
			else if(compString.charAt(i) >= 'A' && compString.charAt(i) <= 'Z')
				freqUpper[compString.charAt(i) - 'A']++;
			else if(compString.charAt(i) >= '0' && compString.charAt(i) <= '9')
				freqNumeric[compString.charAt(i) - '0']++;
			else 
				freqSpecial[compString.charAt(i) - '@']++;
		}
		
		for(int j = 0; j < freqLower.length; j++) {
			if(freqLower[j] == 1) 
				answer++;
		}
		
		for(int k = 0; k < freqUpper.length; k++) {
			if(freqUpper[k] == 1) 
				answer++;
		}
		
		for(int l = 0; l < freqNumeric.length; l++) {
			if(freqNumeric[l] == 1) 
				answer++;
		}
		
		for(int m = 0; m < freqSpecial.length; m++) {
			if(freqSpecial[m] == 1) 
				answer++;
		}
		
		return answer;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// input for compString
		String compString = in.nextLine();
		
		int result = nonRepeatedChar(compString);
		System.out.print(result);
		
	}
}
import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * 
 */
public class Solution
{
	public static int  nonRepeatedChar(String compString)
	{
		int  answer = 0;
		// Write your code here
		if(compString.length() == 0)
			return answer;
		if(compString.length() == 1) {
			answer++;
			return answer;
		}
		int[] freqLower = new int[26]; 
		int[] freqUpper = new int[26];
		int[] freqNumeric = new int[10];
		int[] freqSpecial = new int[26];
		for(int i = 0; i < compString.length(); i++) {
			if(compString.charAt(i) >= 'a' && compString.charAt(i) <= 'z')
				freqLower[compString.charAt(i) - 'a']++;
			else if(compString.charAt(i) >= 'A' && compString.charAt(i) <= 'Z')
				freqUpper[compString.charAt(i) - 'A']++;
			else if(compString.charAt(i) >= '0' && compString.charAt(i) <= '9')
				freqNumeric[compString.charAt(i) - '0']++;
			else 
				freqSpecial[compString.charAt(i) - '@']++;
		}
		
		for(int j = 0; j < freqLower.length; j++) {
			if(freqLower[j] == 1) 
				answer++;
		}
		
		for(int k = 0; k < freqUpper.length; k++) {
			if(freqUpper[k] == 1) 
				answer++;
		}
		
		for(int l = 0; l < freqNumeric.length; l++) {
			if(freqNumeric[l] == 1) 
				answer++;
		}
		
		for(int m = 0; m < freqSpecial.length; m++) {
			if(freqSpecial[m] == 1) 
				answer++;
		}
		
		return answer;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// input for compString
		String compString = in.nextLine();
		
		int result = nonRepeatedChar(compString);
		System.out.print(result);
		
	}
}
import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * 
 */
public class Solution
{
	public static int  nonRepeatedChar(String compString)
	{
		int  answer = 0;
		// Write your code here
		if(compString.length() == 0)
			return answer;
		if(compString.length() == 1) {
			answer++;
			return answer;
		}
		int[] freqLower = new int[26]; 
		int[] freqUpper = new int[26];
		int[] freqNumeric = new int[10];
		int[] freqSpecial = new int[26];
		for(int i = 0; i < compString.length(); i++) {
			if(compString.charAt(i) >= 'a' && compString.charAt(i) <= 'z')
				freqLower[compString.charAt(i) - 'a']++;
			else if(compString.charAt(i) >= 'A' && compString.charAt(i) <= 'Z')
				freqUpper[compString.charAt(i) - 'A']++;
			else if(compString.charAt(i) >= '0' && compString.charAt(i) <= '9')
				freqNumeric[compString.charAt(i) - '0']++;
			else 
				freqSpecial[compString.charAt(i) - '@']++;
		}
		
		for(int j = 0; j < freqLower.length; j++) {
			if(freqLower[j] == 1) 
				answer++;
		}
		
		for(int k = 0; k < freqUpper.length; k++) {
			if(freqUpper[k] == 1) 
				answer++;
		}
		
		for(int l = 0; l < freqNumeric.length; l++) {
			if(freqNumeric[l] == 1) 
				answer++;
		}
		
		for(int m = 0; m < freqSpecial.length; m++) {
			if(freqSpecial[m] == 1) 
				answer++;
		}
		
		return answer;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// input for compString
		String compString = in.nextLine();
		
		int result = nonRepeatedChar(compString);
		System.out.print(result);
		
	}
}

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    sort012(arr);
    print(arr);
  }

}