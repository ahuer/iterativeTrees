package com.points.iterative;

import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.points.tree.Node;

public class BreadthFirstIterative {
	
	public static List<Integer> traverse(Node node, List<Integer> orderList) {
		if (node == null ) {
			return orderList;
		}
		ConcurrentLinkedQueue<Node> queue = new ConcurrentLinkedQueue<>();
		queue.add(node);
		
		Node currentNode;
		
		while (!queue.isEmpty() ) {
			currentNode = queue.poll();
			orderList.add(currentNode.getValue());
			
			if (currentNode.getLeftChild() != null ) {
				queue.add(currentNode.getLeftChild());
			}
			
			if (currentNode.getRightChild() != null ) {
				queue.add(currentNode.getRightChild());
			}
			
		}
		return orderList;
	}

}
