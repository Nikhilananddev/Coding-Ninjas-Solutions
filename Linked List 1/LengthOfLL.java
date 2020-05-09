package LinkedList;

public class LengthOfLL {
	
	public static int lengthOfLinkedList(LinkedListNode<Integer> head) {
		
		int l=0;
		while(head!=null) {
			l++;
			head=head.next;
		}
		return l;
		
	}

}
