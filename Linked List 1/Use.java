package LinkedList;

import java.util.Scanner;

public class Use {
	
	public static void main(String[] args) {
			
//		LinkedListNode<Integer> node=new LinkedListNode<Integer>(1);
//		LinkedListNode<Integer> node1=new LinkedListNode<Integer>(2);
//		LinkedListNode<Integer> node2=new LinkedListNode<Integer>(3);
//		LinkedListNode<Integer> tail=new LinkedListNode<Integer>(4);
//		node.next=node1;
//		node1.next=node2;
//		node2.next=tail;
		LinkedListNode<Integer> head=takeInput();
		print(head);
		System.out.println(LengthOfLL.lengthOfLinkedList(head));
		//head=insert(head, 2, 80);
		System.out.println(FindANode.findNode(head,5));
		head=DeleteANode.delete(head,2);
		print(head);
		System.out.println(FindANode.findNode(head,5));
		
		
//		print(head);
//		while(head!=null) {
//		System.out.print(head.data+" ");
//		head=head.next;
//		}
		
		
		
	}
	public static LinkedListNode<Integer> takeInput(){
		
		Scanner scan=new Scanner(System.in);
		int data=scan.nextInt();
		LinkedListNode<Integer> head=null,tail=null;
		
		while(data!=-1) {
			
			LinkedListNode<Integer> newNode=new LinkedListNode<Integer>(data);
			
			if(head==null) {
				head=newNode;
				tail=newNode;
			}else {		
				tail.next=newNode;
				tail=newNode;
//				LinkedListNode<Integer> temp=head;
//				while(temp.next!=null) {
//					temp=temp.next;
//				}
//				temp.next=newNode;
			}
			
			data=scan.nextInt();
		}
		return head;
	}
	public static void print(LinkedListNode<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head,int posn,int data){
		
		LinkedListNode<Integer> newNode=new LinkedListNode<Integer>(data);
		
		if(posn>LengthOfLL.lengthOfLinkedList(head)) {
			return head;
		}
		if(posn==0) {
			newNode.next=head;
			return newNode;
		}
		LinkedListNode<Integer> prev=null,curr=head;
		int i=1;
		while(i<=posn) {
			prev=curr;
			curr=curr.next;
			i++;
		}
		prev.next=newNode;
		newNode.next=curr;
		return head;
	}
}
