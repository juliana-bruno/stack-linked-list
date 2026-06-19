/*
 * Name: Juliana Bruno
 * Lab: 6
 * Title: StackLinkedList.java
 * Description: ********************************
 * Date: 11/13/25
 */

import java.util.EmptyStackException;
import java.util.LinkedList;

public class StackLinkedList<Character> {
	
	private LinkedList<Character> head = null;
	
	public StackLinkedList() {
		head = new LinkedList<Character>();
	}
	
	public void push(Character item) {
		head.addFirst(item);
	}
	
	public int size() {
		return head.size();
	}
	
	public Character pop() {
		if (size() <= 0) {
			throw new EmptyStackException();
		}
		return head.removeFirst();
	}
	
	public Character peek() {
		if (size() <= 0) {
			throw new EmptyStackException();
		}
		return head.getFirst();
	}
	
	public boolean empty() {
		if (size() <= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	public boolean isBalanced(String expression) {
		StringBuilder input = new StringBuilder(expression);
		for (int i = 0; i <= input.length(); i++) {
			if (input.charAt(i) != '(' && input.charAt(i) != ')') {
				i++;
			} else if (input.charAt(i) == '(') {
				head.push(input.charAt(i));
			} else {
				if (head.isEmpty()) {
					return false;
				} else if (head.peek().equals('(')) {
					head.pop();
					return true;
				} else {
					return false;
				}
			}//end of if else
		}//end of for loop
	}
	*/
	
	
}
