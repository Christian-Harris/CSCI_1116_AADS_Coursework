/*
*	Created by: Christian Harris
*	Date: 8 October 2020
*	This program implements a pair class which defines a pair of String objects.	
*/
class Pair{
	private String state;
	private String capital;
  
	public Pair(String state, String capital){
		this.state = state;
		this.capital = capital;
	}
  
	public String getState(){
		return this.state;
	}
  
	public String getCapital(){
		return this.capital;
	}
}