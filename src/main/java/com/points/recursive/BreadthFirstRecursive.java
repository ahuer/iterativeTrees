package com.points.recursive;

import java.util.List;
import java.util.Queue;

import com.points.tree.Node;

public class BreadthFirstRecursive {
	
	public static List<Integer> traverse(Queue<Node> nodes, List<Integer> orderList) {
		if (nodes.isEmpty() ) {
			return orderList;
		}
		
		Node currentNode = nodes.poll();
		
		if (currentNode.getLeftChild() != null ) {
			nodes.add(currentNode.getLeftChild());
		}
		if (currentNode.getRightChild() != null ) {
			nodes.add(currentNode.getRightChild());
		}
		
		orderList.add(currentNode.getValue());
		
		traverse(nodes, orderList);
		return orderList;		
	}

}
