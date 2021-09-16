package CHAPTER_5_STACK_QUEUE;

import java.util.*;

public class CIRCULAR_QUEUE {
	public static class Queue {
		private int head = 0, tail = 0, numQueueElements = 0;
		private static final int SCALE_FACTOR = 2 ;
		private Integer [] entries;
		public Queue(int capacity) { entries = new Integer [capacity] ; }
		public void enqueue(Integer x) {
			if (numQueueElements == entries.length) { // Need to resize.
			// Makes the queue elements appear consecutively.
			Collections.rotate(Arrays.asList(entries), -head);
			// Resets head and tail.
			head = 0;
			tail = numQueueElements ;
			entries = Arrays.copyOf(entries , numQueueElements * SCALE_FACTOR);
			}
			entries[tail] = x;
			tail = (tail + 1) % entries.length ;
			++numQueueElements ;
		}
			public Integer dequeue(){
			if (numQueueElements != 0) {
			--numQueueElements ;
			Integer ret = entries[head];
			head = (head + 1) % entries.length ;
			return ret;
			}
			throw new NoSuchElementException("Dequeue called on an empty queue.");
			}
			public int size() { return numQueueElements;}
			public void display() {
				for(int i=0;i<numQueueElements;i++)
				{
					System.out.print(entries[i]+" ");
				}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue S=new Queue(5);
		S.enqueue(10);
		S.enqueue(20);
		S.enqueue(30);
		S.enqueue(40);
		System.out.println("Size is : "+S.size());
		System.out.print("The elements are : ");
		S.display();
		

	}

}
