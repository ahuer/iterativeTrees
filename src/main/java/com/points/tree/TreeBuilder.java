package com.points.tree;

import java.util.List;

public class TreeBuilder {

	public static Node setUpTree(List<Integer> nodes) {
		Node firstNode = null;
		
		if (nodes == null ) {
			return null;
		}
		
		for (int num : nodes) {
			if (firstNode == null ) {
				firstNode = new Node(num);
				continue;
			}
			addToTree(firstNode, num);
		}
		
		return firstNode;		
	}
	
	private static void addToTree(Node firstNode, int number) {
		Node currentNode = firstNode;
		
		while (currentNode != null ) {
			Node child;
			boolean isLeftChild = false;
			
			if (number < currentNode.getValue() ) {
				child = currentNode.getLeftChild();
				isLeftChild = true;
			} else {
				child = currentNode.getRightChild();
			}
			
			if (child != null ) {
				currentNode = child;
				continue;
			}
			
			child = new Node(number);
			
			if (isLeftChild ) {
				currentNode.setLeftChild(child);
			} else {
				currentNode.setRightChild(child);
			}
			
			currentNode = null;
		}
	}
	
}
