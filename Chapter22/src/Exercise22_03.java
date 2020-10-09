/*
*	Author: Christian Harris.
*	Date: 9 October 2020.
*	This program prompts the user for two strings and determines if the second string is a substring of the first.
*	The method isSubstring takes the two strings as arguments and returns the index where the first occurence of the substring begins.
*	The method returns -1 if there is no such substring.
*	The algorithm determines the result within a single iteration of the first string. The algorithm is O(n).
*/

import java.util.*;

public class Exercise22_03{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string s1: ");
		String input1 = in.nextLine().trim();
		System.out.print("Enter a string s2: ");
		String input2 = in.nextLine().trim();
		
		int index = Exercise22_03.isSubstring(input1, input2);
		if(index == -1){
			System.out.println(input2 + " is not a substring of " + input1 + ".");
		}
		else{
			System.out.println("Matched at index " + index);
		}
		
		
	}
	
	private static int isSubstring(String s1, String s2){
		//The number of iterations is determined by the relative lengths of the strings.
		for(int i = 0; i < s1.length() - s2.length() + 1; i++){
			if(s1.substring(i, i + s2.length()).equals(s2)){
				return i;
			}
		}
		return -1;
	}
}