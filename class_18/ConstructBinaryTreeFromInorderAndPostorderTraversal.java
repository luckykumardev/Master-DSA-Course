package class_18;


/*
 * https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 */	
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
	 public Node buildTree(int[] inorder, int[] postorder) {
	        int len = inorder.length;
	        return helper(inorder, postorder, 0, len - 1, 0, len - 1);
	    }
	    
	    private Node helper(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart, int postEnd){
	        if (inStart > inEnd) {
	            return null;
	        }
	        
	        int rootVal = postorder[postEnd];
	        Node root = new Node(rootVal);
	        
	        int rootIndex = 0;
	        for (int i=0; i <= inEnd; i++) {
	            if (inorder[i] == rootVal) {
	                rootIndex = i;
	                break;
	            }
	        }
	        
	        int leftTreeSize = rootIndex - inStart;
	        int rightTreeSize = inEnd - rootIndex;
	        
	        root.left = helper(inorder, postorder, inStart, rootIndex - 1, postStart, postStart + leftTreeSize - 1);
	        root.right = helper(inorder, postorder, rootIndex + 1, inEnd, postEnd - rightTreeSize, postEnd - 1);
	        return root;
	    }
}
