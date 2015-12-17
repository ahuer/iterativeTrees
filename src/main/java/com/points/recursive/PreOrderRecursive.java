package com.points.recursive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.points.tree.Node;

public class PreOrderRecursive {
	private static final Logger LOG = LoggerFactory.getLogger(PreOrderRecursive.class);
	
	public static void traverse(Node node) {
		if (node == null ) {
			return;
		}
		
//		LOG.info(node.getValue());
		
		traverse(node.getLeftChild());
		traverse(node.getRightChild());
	}

}
