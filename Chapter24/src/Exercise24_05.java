
public class Exercise24_05{
	public static void main(String[] args){
		GenericQueue<String> myQueue = new GenericQueue<String>();
		System.out.println("Jill added to queue.");
		myQueue.add("Jill");
		System.out.println(myQueue);
		
		System.out.println("Billy added to queue.");
		myQueue.add("Billy");
		System.out.println(myQueue);
		
		System.out.println("Sherman added to queue.");
		myQueue.add("Sherman");
		System.out.println(myQueue);
		
		System.out.println("Dequeue called once.");
		myQueue.dequeue();
		System.out.println(myQueue);
		
		System.out.println("Dequeue called again.");
		myQueue.dequeue();
		System.out.println(myQueue);
		
		System.out.println("Dequeue called a third time.");
		myQueue.dequeue();
		System.out.println(myQueue);
	}
}