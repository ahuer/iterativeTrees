package com.points.tree

import static org.junit.Assert.*
import org.junit.Test

import com.points.tree.TreeBuilder

class TreeBuilderTest {

	@Test
	public void testBuilderShortList() {
		def list = [3, 4, 2]
		def tree = TreeBuilder.setUpTree(list)
		assertEquals(3, tree.getValue())
		assertEquals(2, tree.getLeftChild().getValue())
		assertEquals(4, tree.getRightChild().getValue())
		assertEquals(null, tree.getLeftChild().getLeftChild())
	}
}
