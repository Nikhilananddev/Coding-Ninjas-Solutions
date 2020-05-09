package LinkedList;


public class CheckPalindrome {
	
	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
		
		
		if(head.next==null) {
			return head;
		}
		LinkedListNode<Integer> tail=head.next;
		LinkedListNode<Integer> newHead= reverse(head.next);
		tail.next=head;
		head.next=null;
		return newHead;
	}
	
	
	public static boolean checkPalindrome(LinkedListNode<Integer> head) {
		

		LinkedListNode<Integer> slow=head,fast=head;
		
		while(fast.next!=null && fast.next.next!=null) {
			
			slow=slow.next;
			fast=fast.next.next;
		}
		LinkedListNode<Integer> head1=slow.next;
		LinkedListNode<Integer> head2= head;
		head1=reverse(head1);
		
		while(head1!=null && head2!=null) {
			
			if(!head1.data.equals(head2.data)) {
				return false;
			}
			head1=head1.next;
			head2=head2.next;
		}
		return true;
		
	}
	public static void main(String[] args) {
		LinkedListNode<Integer> head=Use.takeInput();
		System.out.println(checkPalindrome(head));
//		Use.print(head);
	}

	
}
