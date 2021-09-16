package CHAPTER_5_STACK_QUEUE;

import java.util.*;

public class RPN_EXPRESSION {
	public static int eval(String RPNExpression) {
		Deque<Integer> intermediateResults = new LinkedList<>();
		String delimiter =",";
		String[] symbols = RPNExpression.split(delimiter);
		for (String token : symbols) {
		if (token.length() == 1 && "+-*/". contains(token)){
		final int y = intermediateResults.removeFirst();
		final int x = intermediateResults.removeFirst();
		switch (token.charAt(0)){
		case '+':
		intermediateResults.addFirst(x + y);
		break ;
		case '-':
		intermediateResults.addFirst(x - y);
		break ;
		case '*':
		intermediateResults.addFirst(x * y);
		break ;
		case '/':
		intermediateResults.addFirst(x / y);
		break ;
		default:
		throw new IllegalArgumentException("Malformed RPN at :" + token);
		}
		} else { // token is a number.
		intermediateResults.addFirst(Integer.parseInt(token));
		}
		}
		return intermediateResults.removeFirst();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE EXPRESSION : ");
		String s=sc.nextLine();
		System.out.println("THE RESULT IS : "+eval(s));

	}

}
