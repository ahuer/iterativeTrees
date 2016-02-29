package com.points.tree;

public class Node {
	private int value;
	private Node leftChild;
	private Node rightChild;
	
	private Node() {}
	
	public Node(int value) {
		this.value = value;
	}
	
	public void setLeftChild(Node left) {
		leftChild = left;
	}
	
	public void setRightChild(Node right) {
		rightChild = right;
	}
	
	public Node getLeftChild() {
		return leftChild;
	}
	
	public Node getRightChild() {
		return rightChild;
	}
	
	public int getValue() {
		return value;
	}
	
}
