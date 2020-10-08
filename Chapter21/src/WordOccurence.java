
public class WordOccurence implements Comparable<WordOccurence>{
	private String word;
	private int count;
	
	public WordOccurence(String word, int count){
		this.word = word;
		this.count = count;
	}
	
	public String getWord(){
		return this.word;
	}
	
	public int getCount(){
		return this.count;
	}
	
	public int compareTo(WordOccurence o){
		if(this.count < o.getCount()){
			return -1;
		}
		else if(this.count == o.getCount()){
			return 0;
		}
		else{
			return 1;
		}
	}
}