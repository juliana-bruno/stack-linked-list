/*
 * Name: Juliana Bruno
 * Lab: 7
 * Title: Evaluator.java
 * Description: checks if an expression entered by the user has balanced parentheses, brackets, and curly braces
 * Date: 11/13/25
 */

import java.util.Scanner;
import java.util.Stack;

public class Evaluator {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter an expression: ");
		String expression = keyboard.next();
		
		if (checkBalance(expression) == true) {
			System.out.println("Output result: No error has been found.");
		} else {
			System.out.println("Output result: An error has been found.");

		}
			
	}

	public static boolean checkBalance(String expression) {
		Stack<Character> head = new Stack<Character>();
		StringBuilder input = new StringBuilder(expression);
		boolean balance = false;
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '(') {
				head.push(input.charAt(i));
			} else if (input.charAt(i) == ')') {
				if (head.isEmpty()) {
					balance = false;
					break;
				} else if (head.peek().equals('(')) {
					head.pop();
					balance = true;
				}//end of inner if else
				
			} else if (input.charAt(i) == '{') {
				head.push(input.charAt(i));
			} else if (input.charAt(i) == '}') {
				if (head.isEmpty()) {
					balance = false;
					break;
				} else if (head.peek().equals('{')) {
					head.pop();
					balance = true;
				}//end of inner if else
				
			} if (input.charAt(i) == '[') {
				head.push(input.charAt(i));
			} else if (input.charAt(i) == ']') {
				if (head.isEmpty()) {
					balance = false;
					break;
				} else if (head.peek().equals('[')) {
					head.pop();
					balance = true;
				}//end of inner if else
			}//end of outer if else//end of outer if else
			
		}//end of for loop
		
		if (!head.isEmpty()) {
			balance = false;
		}
		
		if (balance == false) {
			return false;
		} else {
			return true;
		}
	}
	

	
}
