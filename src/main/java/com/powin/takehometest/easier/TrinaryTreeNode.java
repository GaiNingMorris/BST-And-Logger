package com.powin.takehometest.easier;

import java.util.ArrayList;
import java.util.List;

public class TrinaryTreeNode {
	private final int value;

	private TrinaryTreeNode leftNode = null;
	private TrinaryTreeNode rightNode = null;
	private TrinaryTreeNode middleNode = null;

	public TrinaryTreeNode(int value) {
		this.value = value;
	}

	public TrinaryTreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(TrinaryTreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public TrinaryTreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(TrinaryTreeNode rightNode) {
		this.rightNode = rightNode;
	}

	public TrinaryTreeNode getMiddleNode() {
		return middleNode;
	}

	public void setMiddleNode(TrinaryTreeNode middleNode) {
		this.middleNode = middleNode;
	}

	public int getValue() {
		return value;
	}

	/**
	 * Adds a new node to the tree rooted at this node. Note that adding a node may
	 * actually mean adding the node to one of the children of this node.
	 *
	 * @param newNode
	 *            the new node to add
	 */
	public void add(TrinaryTreeNode newNode) {
		insertNode(this, newNode);
	}

	/**
	 * insert new node to tree
	 * 
	 * @param root 
	 * 			root node
	 * @param newNode
	 * 			the new node to add
	 * @return
	 *        TrinaryTreeNode
	 */
	public TrinaryTreeNode insertNode(
			TrinaryTreeNode root, TrinaryTreeNode newNode) {
		// if the tree is empty, return a new node
		if (root == null) {
			return newNode;
		}

		// Otherwise, recur down the tree
		if (newNode.value < root.value)
			root.leftNode = insertNode(root.leftNode, newNode);
		else if (newNode.value > root.value)
			root.rightNode = insertNode(root.rightNode, newNode);
		else
			root.middleNode = newNode;

		return root;
	}

	/**
	 * Return the list of all values in the tree rooted at this node, sorted.
	 * 
	 * @return 
	 * 		the sorted values in this tree
	 */
	public List<Integer> getValues() {
		List<Integer> list = new ArrayList<Integer>();
		searchNode(this, list);
		
		return list;
	}

	/**
	 * traverse tree nodes from left -> root -> middle -> right
	 * 
	 * @param root 
	 * 			root node
	 * @param list 
	 * 			the sorted values in this tree
	 */
	private void searchNode(TrinaryTreeNode root, List<Integer> list) {
		if (root.getLeftNode() != null)
			searchNode(root.getLeftNode(), list);
		
		list.add(root.getValue());

		if (root.getMiddleNode() != null)
			list.add(root.getMiddleNode().getValue());

		if (root.getRightNode() != null)
			searchNode(root.getRightNode(), list);
	}
}