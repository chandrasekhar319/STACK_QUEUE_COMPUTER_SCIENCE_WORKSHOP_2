package CHAPTER_5_STACK_QUEUE;

import java.util.*;

public class QUEUE_USING_STACK {
	public static class Queue {
		private Deque <Integer> enq = new LinkedList<>();
		private Deque <Integer> deq = new LinkedList<>();
		public void enqueue(Integer x) { 
			enq.addFirst(x); 
			}
		public Integer dequeue() {
		if (deq.isEmpty()) {
		while (!enq.isEmpty()) {
		deq.addFirst(enq.removeFirst());
		}
		}
		if (!deq.isEmpty()){
		return deq.removeFirst();
		}
		throw new NoSuchElementException("Cannot pop empty queue");
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

	}

}
