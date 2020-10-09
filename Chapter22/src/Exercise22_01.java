/*
*	Author: Christian Harris.
*	Date: 9 October 2020.
*	This program computes the first occurence of a maximum consecutive substring of a given string object. The comparison is based on treating each character as a character primitive.
*	The algorithm utilizes a stack data structure and determines the output after a single iteration of the string. The algorithm is O(n).
*/

import java.util.*;

public class Exercise22_01{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = in.nextLine().trim();
		System.out.println("Maximum consecutive substring is " + Exercise22_01.maxConsecSubstring(input));
	}
	
	private static String maxConsecSubstring(String s){
		Stack<Character> characterStack = new Stack<Character>();
		
		//Initialize the currentMax and the reader to be the first character.
		String currentMax = Character.toString(s.charAt(0));
		String reader = Character.toString(s.charAt(0));
		
		//Iterate through the given string placing each character onto a stack.
		for(int i = 1; i <= s.length(); i++){
			characterStack.push(s.charAt(s.length() - i));
		}
		
		while(!characterStack.isEmpty()){
			//If the next character is consecutive to the final character in the reader then append it onto the reader, otherwise we override the reader to the new character.
			if(characterStack.peek() > reader.charAt(reader.length() - 1)){
				reader = reader + characterStack.pop();
			}
			else{
				reader = characterStack.pop().toString();
			}
			//If the reader reaches a point where it is reading a substring which is strictly longer than the current max we override the current max with the reader.
			if(currentMax.length() < reader.length()){
				currentMax = reader;
			}
		}
		return currentMax;
	}
}