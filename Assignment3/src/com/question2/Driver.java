//Question-2

package com.question2;

public class Driver {
	
		static RightSkewedBinarySearchTree rsbt = new RightSkewedBinarySearchTree();
		

		public static void main(String[] args) {
			RightSkewedBinarySearchTree.Node node = new RightSkewedBinarySearchTree.Node(50);
	        node.left = new RightSkewedBinarySearchTree.Node(30);
	        node.right = new RightSkewedBinarySearchTree.Node(70);
	        node.left.left = new RightSkewedBinarySearchTree.Node(45);
	        node.left.right = new RightSkewedBinarySearchTree.Node(90);

	        rsbt.rightSkewedTree(node);
	        rsbt.printTree(rsbt.getRootnode());

		}

	}	

