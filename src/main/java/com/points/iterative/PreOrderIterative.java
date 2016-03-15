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
		
		while (!stack.isEmpty() ) {	
			Node currentNode = stack.pop();
			orderList.add(currentNode.getValue());
			
			Node child = currentNode.getRightChild();
			
			if (child != null ) {
				stack.add(child);
			}
			
			child = currentNode.getLeftChild();
			
			if (child != null ) {
				stack.add(child);
			}
		}
		
		return orderList;
	}

}
