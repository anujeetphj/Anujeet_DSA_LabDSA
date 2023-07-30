package com.greatlearning.p1;
import java.util.Scanner;
import java.util.Stack;

public class BracketProblem {
	
	public static String expression;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Please enter the expression to evaluate");
		expression = sc.next();
		
		boolean result;
		result = isBracketBalanced(expression);
		
		if (result) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
	
	public static boolean isBracketBalanced(String expression)
	{
		Stack <Character> stack = new Stack<>();
		
		for (int i = 0; i < expression.length(); i++) {
	        if (stack.empty()) {

	            stack.push(expression.charAt(i));
	        }
	        else if ((stack.peek() == '(' && expression.charAt(i) == ')')
	                 || (stack.peek() == '{' && expression.charAt(i) == '}')
	                 || (stack.peek() == '[' && expression.charAt(i) == ']')) {

	            stack.pop();
	        }
	        else {
	            stack.push(expression.charAt(i));
	        }
	    }
		
		return stack.isEmpty() ? true : false;
	}
}