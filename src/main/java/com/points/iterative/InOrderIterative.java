package com.points.iterative;

import java.util.List;
import java.util.Stack;

import com.points.tree.Node;

public class InOrderIterative {

    public static List<Integer> traverse(Node node, List<Integer> orderList) {
        if (node == null) {
            return orderList;
        }

        Stack<Node> stack = new Stack<>();
        Node currentNode = node;

        while (!stack.isEmpty() || currentNode != null) {

            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.getLeftChild();
                continue;
            }
            
            currentNode = stack.pop();
            orderList.add(currentNode.getValue());
            currentNode = currentNode.getRightChild();
        }

        return orderList;
    }

}
