package com.points.iterative;

import java.util.List;
import java.util.Stack;

import com.points.tree.Node;

public class InOrderIterative {
	
	public static List<Integer> traverse(Node node, List<Integer> orderList) {
		if (node == null ) {
			return orderList;
		}
		
		Stack<Node> stack = new Stack<>();
		stack.push(node);
		
		boolean traverseLeft = true;
		
		while (!stack.isEmpty() ) {
			Node currentNode = stack.peek();
			
			while (traverseLeft && currentNode.getLeftChild() != null ) {
				stack.add(currentNode.getLeftChild());
				currentNode = stack.peek();				
			}
			traverseLeft = false;
			
			currentNode = stack.pop();
			orderList.add(currentNode.getValue());
			
			if (currentNode.getRightChild() != null ) {
				stack.add(currentNode.getRightChild());
				traverseLeft = true;
			}			
		}
		
		return orderList;
	}

}
