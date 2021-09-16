package CHAPTER_5_STACK_QUEUE;

import java.util.Stack;

public class STACK_OPERATION {
	public static void push(Stack<Integer> stack) {
		for(int i=0;i<5;i++)
			stack.push(i);
	}
	public static void pop(Stack<Integer> stack) {
		Integer A = null;
		for(int i=0;i<2;i++) 
		{
			A=(Integer)stack.pop();
			System.out.println(A+" is deleted");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(1);stack.push(2);stack.push(3);stack.push(4);stack.push(5);stack.push(6);
		System.out.println("The stack is : "+stack);
		stack.pop();
		stack.pop();
		System.out.println("The stack is : "+stack);
		push(stack);
		System.out.println("The stack is : "+stack);
		pop(stack);
		System.out.println("The stack is : "+stack);
		Stack s1=new Stack();
		s1.push("A");s1.push("B");s1.push("C");s1.push("D");s1.push("E");
		System.out.println("The stack is : "+s1);
		System.out.println("Element at peek is : "+s1.peek());
		s1.pop();
		s1.pop();
		System.out.println("The stack is : "+s1);
		System.out.println("Element at peek is : "+s1.peek());

	}

}
