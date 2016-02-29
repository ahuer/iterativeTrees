package com.points.recursive;

import java.util.List;

import com.points.tree.Node;

public class InOrderRecursive {
	
	public static List<Integer> traverse(Node node, List<Integer> orderList) {
		if (node == null ) {
			return orderList;
		}
		
		traverse(node.getLeftChild(), orderList);
		orderList.add(node.getValue());
		traverse(node.getRightChild(), orderList);
		
		return orderList;
	}

}
