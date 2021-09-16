package CHAPTER_5_STACK_QUEUE;

import java.util.*;

public class MAX_COUNT {
	static class stackwithmax{
		static Stack<Integer> actual=new Stack<Integer>();
		static Stack<Integer> cacheStack=new Stack<Integer>();
		static void push(int x)
		{
			actual.push(x);
			if(actual.size()==1)
			{
				cacheStack.push(x);
				return ;
			}
			if(x>cacheStack.peek())
				cacheStack.push(x);
			else cacheStack.push(cacheStack.peek());
		}
		static void pop() {
			actual.pop();
			cacheStack.pop();
		}
		static int getmax() {
			return cacheStack.peek();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackwithmax s=new stackwithmax();
		s.push(10);
		s.push(20);
		s.push(30);
		s.pop();
		s.pop();
		s.push(50);
		System.out.println("MAX ELEMENT: "+s.getmax());
		

	}

}
