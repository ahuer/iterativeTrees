package com.points.recursive;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.points.tree.Node;

public class PreOrderRecursive {
	
	public static List<Integer> traverse(Node node, List<Integer> orderList) {
		if (node == null ) {
			return orderList;
		}
		
		orderList.add(node.getValue());
		
		traverse(node.getLeftChild(), orderList);
		traverse(node.getRightChild(), orderList);
		return orderList;
	}

}
