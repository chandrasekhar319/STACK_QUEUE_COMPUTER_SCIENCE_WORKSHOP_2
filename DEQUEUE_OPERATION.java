package CHAPTER_5_STACK_QUEUE;

import java.util.*;

public class DEQUEUE_OPERATION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Deque<String> deque= new LinkedList<String>();
    deque.add("A");
    deque.addFirst("B");
    deque.addLast("C");
    deque.add("D");
    deque.addFirst("E");
    deque.add("F");
    System.out.println("The Deque is : "+deque + "\n");
    deque.removeFirst();
    deque.removeLast();
    System.out.println("Deque after removing first and last: "+ deque);
    Deque<String> deque1= new ArrayDeque<String>();

// add() method to insert
deque1.add("B");
deque1.addFirst("A");
deque1.addLast("C");

System.out.println("\nThe deque is : "+deque1);

	}

}
