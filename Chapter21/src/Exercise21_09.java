import java.util.*;

public class Exercise21_09{
	public static void main(String[] args){
		HashMap<String, String> map = new HashMap<>();
		String[][] stateCapital = {
			{"Alabama", "Montgomery"},
			{"Alaska", "Juneau"},
			{"Arizona", "Phoenix"},
			{"Arkansas", "Little Rock"},
			{"California", "Sacramento"},
			{"Colorado", "Denver"},
			{"Connecticut", "Hartford"},
			{"Delaware", "Dover"},
			{"Florida", "Tallahassee"},
			{"Georgia", "Atlanta"},
			{"Hawaii", "Honolulu"},
			{"Idaho", "Boise"},
			{"Illinois", "Springfield"},
			{"Indiana", "Indianapolis"},
			{"Iowa", "Des Moines"},
			{"Kansas", "Topeka"},
			{"Kentucky", "Frankfort"},
			{"Louisiana", "Baton Rouge"},
			{"Maine", "Augusta"},
			{"Maryland", "Annapolis"},
			{"Massachusettes", "Boston"},
			{"Michigan", "Lansing"},
			{"Minnesota", "Saint Paul"},
			{"Mississippi", "Jackson"},
			{"Missouri", "Jefferson City"},
			{"Montana", "Helena"},
			{"Nebraska", "Lincoln"},
			{"Nevada", "Carson City"},
			{"New Hampshire", "Concord"},
			{"New Jersey", "Trenton"},
			{"New York", "Albany"},
			{"New Mexico", "Santa Fe"},
			{"North Carolina", "Raleigh"},
			{"North Dakota", "Bismarck"},
			{"Ohio", "Columbus"},
			{"Oklahoma", "Oklahoma City"},
			{"Oregon", "Salem"},
			{"Pennsylvania", "Harrisburg"},
			{"Rhode Island", "Providence"},
			{"South Carolina", "Columbia"},
			{"South Dakota", "Pierre"},
			{"Tennessee", "Nashville"},
			{"Texas", "Austin"},
			{"Utah", "Salt Lake City"},
			{"Vermont", "Montpelier"},
			{"Virginia", "Richmond"},
			{"Washington", "Olympia"},
			{"West Virginia", "Charleston"},
			{"Wisconsin", "Madison"},
			{"Wyoming", "Cheyenne"}
		};
	
		for(int i = 0; i < 50; i++){
			map.put(stateCapital[i][1], stateCapital[i][0]);
		}

		Scanner input = new Scanner(System.in);
    
		int correctCount = 0;
	
		for(Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("What is the capital of " + value + "? ");
			String capital = input.nextLine().trim().toLowerCase();
		
			if(capital.equals(key.toLowerCase())){
				System.out.println("Your answer is correct");
				correctCount++;
			}
			else{
				System.out.println("The correct answer should be " + key);
			}
		}
		System.out.println("The correct count is " + correctCount);
	}
}
