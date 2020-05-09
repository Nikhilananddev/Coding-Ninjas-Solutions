package LinkedList;

public class DeleteANode {

public static LinkedListNode<Integer> delete(LinkedListNode<Integer> head,int index){
		
		if(head==null) {
			return head;
		}
		if(index>=LengthOfLL.lengthOfLinkedList(head)) {
			return head;
		}
		if(index==0) {
			return head.next;
		}
		int i=1;
		LinkedListNode<Integer> curr=head,prev=null;
		while(i<=index) {
			prev=curr;
			curr=curr.next;
			i++;
		}
		prev.next=curr.next;
		return head;
		
		
	}
}
