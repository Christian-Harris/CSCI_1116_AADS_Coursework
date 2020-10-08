import java.util.LinkedList;

public class GenericQueue<E> extends LinkedList<E>{
	
	public void enqueue(E e){
		this.addLast(e);
	}
	
	public E dequeue(){
		return this.remove();
	}
}