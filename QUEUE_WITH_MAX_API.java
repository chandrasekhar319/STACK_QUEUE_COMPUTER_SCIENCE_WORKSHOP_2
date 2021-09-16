package CHAPTER_5_STACK_QUEUE;

import java.util.*;

public class QUEUE_WITH_MAX_API {
	public static class QueueWithMax<Integer extends Comparable <Integer>> {
		private Queue<Integer> entries = new LinkedList<>();
		private Deque<Integer> candidatesForMax = new LinkedList<>();
		public void enqueue(Integer x) {
		entries.add(x);
		while (!candidatesForMax.isEmpty()){
		// Eliminate dominated elements in candidatesForMax.
		if (candidatesForMax .getLast().compareTo(x) >= 0) {
		break ;
		}
		candidatesForMax.removeLast();
		}
		candidatesForMax.addLast(x);
		}
		public Integer dequeue(){
		if (!entries.isEmpty()){
		Integer result = entries.remove();
		if (result.equals(candidatesForMax.getFirst())){
		candidatesForMax.removeFirst();
		}
		return result;
		}
		throw new NoSuchElementException("Called dequeueQ on empty queue.");
		}
		public Integer max() {
		if (!candidatesForMax.isEmpty()){
		return candidatesForMax.getFirst();
		}
		throw new NoSuchElementException("empty queue");
		}
		public void print()
		{
			System.out.println("The enqueue elements are : "+entries);
			System.out.println("The dequeue elements are : "+candidatesForMax);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueWithMax<Integer> s=new QueueWithMax<Integer>();
		s.enqueue(3);
		s.enqueue(1);
		s.enqueue(3);
		s.enqueue(2);
		s.enqueue(0);
		s.print();
		System.out.println("Max Element : "+s.max());
		System.out.println("dequeue Element is : "+s.dequeue());
		System.out.println("dequeue Element is : "+s.dequeue());
		s.print();
		System.out.println("Max Element : "+s.max());
		

	}

}
