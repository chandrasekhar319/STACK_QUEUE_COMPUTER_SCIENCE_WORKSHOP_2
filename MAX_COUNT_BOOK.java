package CHAPTER_5_STACK_QUEUE;

import java.util.*;

class MaxWithCount {
	public Integer max;
	public Integer count ;
	public MaxWithCount(Integer max, Integer count) {
		this.max = max ;
		this.count = count ;
	}
}
public class MAX_COUNT_BOOK {
	public static void main(String[] a) {
	StackQ s =new StackQ();
	s.push(10);
	s.push(20);
	s.push(30);
	s.push(40);
	s.push(50);
	s.push(60);
	System.out.print("Stack=");
	s.print();
	System.out.println("Max element="+s.max());
	System.out.println("Popped element="+s.pop());
	System.out.println("Popped element="+s.pop());
	System.out.println("Popped element="+s.pop());
	System.out.println("Popped element="+s.pop());
	System.out.print("Stack=");
	s.print();
	System.out.println("Max element="+s.max());
	
	}
static class StackQ {
private Deque<Integer> element = new LinkedList <>();
private Deque<MaxWithCount> cachedMaxWithCount = new LinkedList <>();
public boolean empty() { return element.isEmpty(); }
public Integer max() {
	if(empty()) {
		throw new IllegalStateException("max(): empty stack");
	}
	return cachedMaxWithCount.peekFirst().max ;
}
public void print()
{
	System.out.println(element);
}
public Integer pop() {
	if(empty()) {
		throw new IllegalStateException("pop(): empty stack");
	}
	Integer popElement = element.removeFirst();
	if (popElement.equals(cachedMaxWithCount.peekFirst().max)){
		cachedMaxWithCount.peekFirst().count= cachedMaxWithCount.peekFirst().count - 1;
		if (cachedMaxWithCount.peekFirst().count.equals(0)){
			cachedMaxWithCount.removeFirst();
		}
	}
	return popElement;
}
public void push(Integer x) {
	element.addFirst(x);
	if (!cachedMaxWithCount.isEmpty()) {
		if (Integer.compare(x, cachedMaxWithCount.peekFirst().max) == 0) {
			cachedMaxWithCount.peekFirst().count
			= cachedMaxWithCount.peekFirst().count + 1;
		} else if (Integer.compare(x, cachedMaxWithCount.peekFirst().max) > 0) {
			cachedMaxWithCount.addFirst(new MaxWithCount(x, 1));
			}
	} else {
			cachedMaxWithCount . addFirst (new MaxWithCount (x , 1));
	}

}
}
}
