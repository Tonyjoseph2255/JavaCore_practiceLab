package org.ust.mylearning.collection;

import java.util.Stack;

public class ListStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();

        // Push operation
        stack.push(5);
        stack.push(2);
        stack.push(3);

        // Peek operation
        System.out.println("Peek: " + stack.peek()); 
        System.out.println("Pop: " + stack.pop()); // Should print 3
        System.out.println("Pop: " + stack.pop()); // Should print 2
        System.out.println("Pop: " + stack.pop());
System.out.println( stack.isEmpty());
	}

}
