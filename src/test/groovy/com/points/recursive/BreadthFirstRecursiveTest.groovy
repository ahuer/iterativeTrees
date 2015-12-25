package com.points.recursive

import static org.junit.Assert.*

import java.util.concurrent.ConcurrentLinkedQueue

import org.junit.Test

import com.points.tree.TreeBuilder

class BreadthFirstRecursiveTest {
	
	@Test
	public void testBreadthFirstRecursive() {
		def list = [10, 4, 20, 3, 6, 15, 21, 1, 7]
		def tree = TreeBuilder.setUpTree(list)
		def queue = new ConcurrentLinkedQueue()
		queue.add(tree)
		assertEquals(list, BreadthFirstRecursive.traverse(queue, []))		
	}

}
