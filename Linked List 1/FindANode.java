package LinkedList;

public class FindANode {
	
	public static int findNode(LinkedListNode<Integer> head,int data){
		
		if(head==null) {
			return -1;
		}
		
		int i=0;
		while(head!=null) {
			if(head.data==data) {
				return i;
			}
			i++;
			head=head.next;
		}
		return -1;
		
	}

}
