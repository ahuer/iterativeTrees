package com.points.iterative

import static org.junit.Assert.*

import org.junit.Test

import com.points.tree.TreeBuilder

class BreadthFirstIterativeTest {
	
	@Test
	public void testBreadthFirstSearch() {
		def list = [10, 4, 20, 3, 6, 15, 21, 1, 7]
		def tree = TreeBuilder.setUpTree(list)
		assertEquals(list, BreadthFirstIterative.traverse(tree, []))
	}
}
