package LinkedList;

public class PrintIthNode {

	public static void printIthNode(LinkedListNode<Integer> head,int posn) {

		if(head==null) {
			return ;
		}
		if(posn>=LengthOfLL.lengthOfLinkedList(head)) {
			return ;
		}

		int i=1;
		while(i<=posn) {
			head=head.next;
			i++;
		}
		System.out.println(head.data);

	}

}
