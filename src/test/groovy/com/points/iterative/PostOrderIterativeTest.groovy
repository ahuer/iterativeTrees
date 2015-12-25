package com.points.iterative

import static org.junit.Assert.*

import org.junit.Test

import com.points.tree.TreeBuilder

class PostOrderIterativeTest {
	
	@Test
	public void testPostOrderRecursive() {
		def list = [10, 4, 20, 3, 6, 15, 21, 1, 7]
		def expectedResult = [1, 3, 7, 6, 4, 15, 21, 20, 10]
		def tree = TreeBuilder.setUpTree(list)
		assertEquals(expectedResult, PostOrderIterative.traverse(tree, []))
	}

}
