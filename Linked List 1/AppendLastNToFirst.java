package LinkedList;

public class AppendLastNToFirst {
	
	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head,int n){
	
		if(n==0) {
			return head;
		}
		
		LinkedListNode<Integer> tempHead=head;
		int length=LengthOfLL.lengthOfLinkedList(head);
		
		if(length==n) {
			
			//reverse
			
		}
		int pos= length-n -1;
		int i=1;
		while(i<=pos) {
			head=head.next;
			i++;
		}
		LinkedListNode<Integer> newHead= head.next,temp=newHead;
		head.next=null;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=tempHead;
		
		return newHead;
		
		
	}
	
	public static void main(String[] args) {
		
		LinkedListNode<Integer> head=Use.takeInput();
		head=appendLastNToFirst(head, 5);
		Use.print(head);
	}

}
