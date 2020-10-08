/*
*	Created by: Christian Harris
*	Date: 8 October 2020
*	This program implements a state-capital game.	
*/

import java.util.*;

public class Exercise20_3{
	private static ArrayList<Pair> stateCapital = new ArrayList<Pair>();
	
	public static void main(String[] args) {
		
		stateCapital.add(new Pair("Alabama", "Montgomery"));
		stateCapital.add(new Pair("Alaska", "Juneau"));
		stateCapital.add(new Pair("Arizona", "Phoenix"));
		stateCapital.add(new Pair("Arkansas", "Little Rock"));
		stateCapital.add(new Pair("California", "Sacramento"));
		stateCapital.add(new Pair("Colorado", "Denver"));
		stateCapital.add(new Pair("Connecticut", "Hartford"));
		stateCapital.add(new Pair("Delaware", "Dover"));
		stateCapital.add(new Pair("Florida", "Tallahassee"));
		stateCapital.add(new Pair("Georgia", "Atlanta"));
		stateCapital.add(new Pair("Hawaii", "Honolulu"));
		stateCapital.add(new Pair("Idaho", "Boise"));
		stateCapital.add(new Pair("Illinois", "Springfield"));
		stateCapital.add(new Pair("Indiana", "Indianapolis"));
		stateCapital.add(new Pair("Iowa", "Des Moines"));
		stateCapital.add(new Pair("Kansas", "Topeka"));
		stateCapital.add(new Pair("Kentucky", "Frankfort"));
		stateCapital.add(new Pair("Louisiana", "Baton Rouge"));
		stateCapital.add(new Pair("Maine", "Augusta"));
		stateCapital.add(new Pair("Maryland", "Annapolis"));
		stateCapital.add(new Pair("Massachusettes", "Boston"));
		stateCapital.add(new Pair("Michigan", "Lansing"));
		stateCapital.add(new Pair("Minnesota", "Saint Paul"));
		stateCapital.add(new Pair("Mississippi", "Jackson"));
		stateCapital.add(new Pair("Missouri", "Jefferson City"));
		stateCapital.add(new Pair("Montana", "Helena"));
		stateCapital.add(new Pair("Nebraska", "Lincoln"));
		stateCapital.add(new Pair("Nevada", "Carson City"));
		stateCapital.add(new Pair("New Hampshire", "Concord"));
		stateCapital.add(new Pair("New Jersey", "Trenton"));
		stateCapital.add(new Pair("New York", "Albany"));
		stateCapital.add(new Pair("New Mexico", "Santa Fe"));
		stateCapital.add(new Pair("North Carolina", "Raleigh"));
		stateCapital.add(new Pair("North Dakota", "Bismarck"));
		stateCapital.add(new Pair("Ohio", "Columbus"));
		stateCapital.add(new Pair("Oklahoma", "Oklahoma City"));
		stateCapital.add(new Pair("Oregon", "Salem"));
		stateCapital.add(new Pair("Pennsylvania", "Harrisburg"));
		stateCapital.add(new Pair("Rhode Island", "Providence"));
		stateCapital.add(new Pair("South Carolina", "Columbia"));
		stateCapital.add(new Pair("South Dakota", "Pierre"));
		stateCapital.add(new Pair("Tennessee", "Nashville"));
		stateCapital.add(new Pair("Texas", "Austin"));
		stateCapital.add(new Pair("Utah", "Salt Lake City"));
		stateCapital.add(new Pair("Vermont", "Montpelier"));
		stateCapital.add(new Pair("Virginia", "Richmond"));
		stateCapital.add(new Pair("Washington", "Olympia"));
		stateCapital.add(new Pair("West Virginia", "Charleston"));
		stateCapital.add(new Pair("Wisconsin", "Madison"));
		stateCapital.add(new Pair("Wyoming", "Cheyenne"));
		
		Collections.shuffle(stateCapital);

		Scanner input = new Scanner(System.in);
    
		int correctCount = 0;

		for (int i = 0; i < stateCapital.size(); i++) {
			// Prompt the user with a question
			System.out.print("What is the capital of " + stateCapital.get(i).getState() + "? ");
			String capital = input.nextLine().trim().toLowerCase();
      
			if (capital.toLowerCase().equals(stateCapital.get(i).getCapital().toLowerCase())) {
				System.out.println("Your answer is correct");
				correctCount++;
			}
			else{
				System.out.println("The correct answer should be " + stateCapital.get(i).getCapital());
			}
		}

		System.out.println("The correct count is " + correctCount);
	}
}
