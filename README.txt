This take-home test has two problems : an easier one, and a harder one.

You do not need to do both, though you can if you want.



The easier test (in com.powin.takehometest.easier) is based on a "Trinary Tree". A trinary tree is made up
of nodes; like a binary tree, all of the left child nodes have a lower value, and all of the right child nodes 
have a higher value. Unlike a binary tree, each node also has "middle children", where each child has an
identical value to its parent.

For example, this is a valid trinary tree :
        5
      / | \
     3  5  6
    / \
   2   4

The test has three parts :

1. Implement TrinaryTreeNode.add(). There is a unit test in TrinaryTreeNodeTests that you can use to
   make sure you are implementing the correct behavior. Using the above example, if you were to add a node
   with a value of 4 to the root node, it would end up as a middle child of the 4 node that is the right
   child of the 3 node.
2. Implement TrinaryTreeNode.getValues(). This returns a list of node values in the sorted order. Using the
   above example, it would return [2, 3, 4, 5, 5, 6].
3. Implement a unit test for TrinaryTreeNode.getValues().

 
 
 The harder test (in com.powin.takehometest.harder) is to implement a "delaying logger". This logger
 receives loglines with associated time delays, and is expected to log those messages after that delay 
 has passed.
 
The test has two parts :
1. Implement DelayingLogger.logMessage().
2. Implement a unit test to demonstrate that you are logging with appropriate delays.

It is very important that this class be thread-safe.
