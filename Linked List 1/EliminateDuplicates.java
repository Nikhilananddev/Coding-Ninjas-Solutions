package LinkedList;

public class EliminateDuplicates {
	
	public static LinkedListNode<Integer> eliminateDuplicates(LinkedListNode<Integer> head){
		
		
		LinkedListNode<Integer> curr=head;
		while(curr.next!=null) {
			
			if(curr.data.equals(curr.next.data)) {
				curr.next=curr.next.next;
			}else {
				curr=curr.next;
			}
			
		}
		return head;
		
	}
	public static void main(String[] args) {
		LinkedListNode<Integer> head=Use.takeInput();
		head=eliminateDuplicates(head);
		Use.print(head);
	}

}
