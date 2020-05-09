package LinkedList;

public class LinkedListNode<T> {
	
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data=data;
		this.next=null;
	}
}
