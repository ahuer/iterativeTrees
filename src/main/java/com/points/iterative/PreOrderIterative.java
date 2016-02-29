package com.points.iterative;

import java.util.List;
import java.util.Stack;

import com.points.tree.Node;

public class PreOrderIterative {
	
	public static List<Integer> traverse(Node node, List<Integer> orderList) {
		if (node == null ) {
			return orderList;
		}
		
		Stack<Node> stack = new Stack<>();
		stack.add(node);
		orderList.add(node.getValue());
		boolean traverseLeft = true;
		
		while (!stack.isEmpty() ) {	
			Node currentNode = stack.peek();
			
			Node child = currentNode.getLeftChild();
			if (traverseLeft && child != null ) {
				stack.add(child);
				orderList.add(child.getValue());
				continue;
			}
			traverseLeft = false;
			
			child = currentNode.getRightChild();
			if (child != null ) {
				stack.add(child);
				orderList.add(child.getValue());
				traverseLeft = true;
				continue;
			}
			
			currentNode = stack.pop();
			while (!stack.isEmpty() && stack.peek().getRightChild() == currentNode ) {
				currentNode = stack.pop();
			}
		}
		
		return orderList;
	}

}
