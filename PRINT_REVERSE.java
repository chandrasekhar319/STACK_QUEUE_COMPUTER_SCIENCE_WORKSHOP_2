package CHAPTER_5_STACK_QUEUE;

import java.util.*;

 class ListNode<Integer>{
	 public Integer data;
     public ListNode<Integer> next;
     ListNode<Integer> head;
     ListNode(Integer a)
       {
	          data=a;
       }
}
public class PRINT_REVERSE {
	public static void display(ListNode node) {
    	while(node!=null)
    	{
    		System.out.print(node.data+" : ");
    		node=node.next;
    	}
    }
	public static void printLinkedListlnReverse(ListNode<Integer> head) {
		Deque<Integer> nodes = new LinkedList <>();
		while (head != null) {
			nodes.addFirst(head.data);
			head = head.next ;
			}
			while (!nodes.isEmpty()){
			System.out.print(nodes.poll()+" : ");
			}
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The LinkedList is : ");
		ListNode<Integer> l1=new ListNode<Integer>(10);
		ListNode<Integer> l2=new ListNode<Integer>(20);
		ListNode<Integer> l3=new ListNode<Integer>(30);
		ListNode<Integer> l4=new ListNode<Integer>(40);
		ListNode<Integer> l5=new ListNode<Integer>(50);
		ListNode<Integer> l6=new ListNode<Integer>(60);
		ListNode<Integer> l7=new ListNode<Integer>(70);
		l1.next=l2;l2.next=l3;l3.next=l4;l4.next=l5;l5.next=l6;l6.next=l7;
		display(l1);
		System.out.println("\nAfter Reversing : ");
		printLinkedListlnReverse(l1);

	}

}
