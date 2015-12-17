package com.points.tree;

import java.util.List;

public class TreeBuilder {

	public Node setUpTree(List<Integer> nodes) {
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
	
	private void addToTree(Node firstNode, int number) {
		Node currentNode = firstNode;
		
		while (currentNode != null ) {
			Node leftChild;
			Node rightChild;
			
			if (number < currentNode.getValue() ) {
				leftChild = currentNode.getLeftChild();
			} else {
				rightChild = currentNode.getRightChild();
			}
			
//			if (child == null ) {
//				child = new Node(number);
//			}
		}
	}
	
}
