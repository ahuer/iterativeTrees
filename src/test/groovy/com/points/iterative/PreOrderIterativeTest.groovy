package com.points.iterative

import static org.junit.Assert.*

import org.junit.Test

import com.points.tree.TreeBuilder

class PreOrderIterativeTest {

	@Test
	public void testPreOrderIterative() {
		def list = [10, 4, 20, 3, 6, 15, 21, 1, 7]
		def expectedResult = [10, 4, 3, 1, 6, 7, 20, 15, 21]
		def tree = TreeBuilder.setUpTree(list)
		assertEquals(expectedResult, PreOrderIterative.traverse(tree, []))
	}
}
