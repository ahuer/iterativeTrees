package com.points.recursive;

import java.util.List;

import com.points.tree.Node;

public class PostOrderRecursive {
	
	public static List<Integer> traverse(Node node, List<Integer> orderList) {
		if (node == null ) {
			return orderList;
		}
		
		traverse(node.getLeftChild(), orderList);
		traverse(node.getRightChild(), orderList);
		orderList.add(node.getValue());
		
		return orderList;
	}

}
