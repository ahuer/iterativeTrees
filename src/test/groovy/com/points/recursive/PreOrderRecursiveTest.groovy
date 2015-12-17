package com.points.recursive

import static org.junit.Assert.*
import org.junit.Test

import com.points.tree.TreeBuilder
import com.points.recursive.PreOrderRecursive

class PreOrderRecursiveTest {

	@Test
	public void testRecusive() {
		def list = [10, 4, 20, 3, 6, 15, 21, 1, 7]
		def expectedResult = [10, 4, 3, 1, 6, 7, 20, 15, 21]
		def tree = TreeBuilder.setUpTree(list)
		assertEquals(expectedResult, PreOrderRecursive.traverse(tree, []))		
	}
}
