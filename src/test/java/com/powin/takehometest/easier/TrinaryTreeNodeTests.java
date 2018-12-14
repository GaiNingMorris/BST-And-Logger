package com.powin.takehometest.easier;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TrinaryTreeNodeTests {

	@Test
	public void testAdds() {
		TrinaryTreeNode rootNode = new TrinaryTreeNode(10);
		rootNode.add(new TrinaryTreeNode(5));
		rootNode.add(new TrinaryTreeNode(10));
		rootNode.add(new TrinaryTreeNode(15));
		rootNode.add(new TrinaryTreeNode(25));

		Assert.assertNotNull(rootNode.getLeftNode());
		Assert.assertNotNull(rootNode.getRightNode());
		Assert.assertNotNull(rootNode.getMiddleNode());

		Assert.assertNull(rootNode.getLeftNode().getLeftNode());
		Assert.assertNull(rootNode.getLeftNode().getRightNode());
		Assert.assertNull(rootNode.getLeftNode().getMiddleNode());

		Assert.assertNull(rootNode.getMiddleNode().getLeftNode());
		Assert.assertNull(rootNode.getMiddleNode().getRightNode());
		Assert.assertNull(rootNode.getMiddleNode().getMiddleNode());

		Assert.assertNull(rootNode.getRightNode().getLeftNode());
		Assert.assertNotNull(rootNode.getRightNode().getRightNode());
		Assert.assertNull(rootNode.getRightNode().getMiddleNode());

		Assert.assertEquals(10, rootNode.getValue());
		Assert.assertEquals(5, rootNode.getLeftNode().getValue());
		Assert.assertEquals(15, rootNode.getRightNode().getValue());
		Assert.assertEquals(25, rootNode.getRightNode().getRightNode().getValue());
	}

	@Test
	public void testGetValues() {
		TrinaryTreeNode rootNode = new TrinaryTreeNode(5);
		rootNode.add(new TrinaryTreeNode(3));
		rootNode.add(new TrinaryTreeNode(5));
		rootNode.add(new TrinaryTreeNode(6));
		rootNode.add(new TrinaryTreeNode(2));
		rootNode.add(new TrinaryTreeNode(4));
		List<Integer> list = rootNode.getValues();
		
		int index = 0;
		Assert.assertEquals(2, list.get(index++).intValue());
		Assert.assertEquals(3, list.get(index++).intValue());
		Assert.assertEquals(4, list.get(index++).intValue());
		Assert.assertEquals(5, list.get(index++).intValue());
		Assert.assertEquals(5, list.get(index++).intValue());
		Assert.assertEquals(6, list.get(index++).intValue());
	}
}