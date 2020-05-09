package LinkedList;

public class PrintReverseLL {
	
	public static void printReverse(LinkedListNode<Integer> head) {
		
		if(head==null) {
			return;
		}
		
		printReverse(head.next);
		System.out.println(head.data);
		
		
	}
	
	public static void main(String[] args) {
		LinkedListNode<Integer> head=Use.takeInput();
//		head=eliminateDuplicates(head);
		printReverse(head);
		Use.print(head);
	}

}
