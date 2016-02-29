package com.points.recursive

import static org.junit.Assert.*

import org.junit.Test

import com.points.tree.TreeBuilder

class InOrderRecursiveTest {
	
	@Test
	public void testInOrderRecursive() {
		def list = [10, 4, 20, 3, 6, 15, 21, 1, 7]
		def expectedResult = [1, 3, 4, 6, 7, 10, 15, 20, 21]
		def tree = TreeBuilder.setUpTree(list)
		assertEquals(expectedResult, InOrderRecursive.traverse(tree, []))
	}

}
