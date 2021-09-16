package CHAPTER_5_STACK_QUEUE;

import java.util.Stack;

public class STACK1 {
	public static Stack<Integer> push(Stack<Integer> s)
	{
	     for(int i=0;i<10;++i)
	     {
	    	 s.push(i);
	     }
	     return s;
	}
	public static Stack<Integer> pop(Stack<Integer> s)
	{
	     for(int i=0;i<5;++i)
	     {
	    	 Integer a= (Integer) s.pop();
	    	 System.out.println(a+" popped");
	     }
	     return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<Integer>();
		s=push(s);
		System.out.println("Push operation");
		System.out.println("Stack = "+s);
		System.out.println("element at peek="+s.peek());
		System.out.println("Pop operation");
		s=pop(s);
		System.out.println("Stack = "+s);
		System.out.println("element at peek="+s.peek());
	}

}
