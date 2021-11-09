package class_17;
/*
 https://leetcode.com/problems/minimum-depth-of-binary-tree/
*/
public class MinimumDepthOfBinaryTree {
	   public int minDepth(Node root) {
	        if(root == null) return 0;
	        return helper(root);
	     }
	    
	    private static int helper(Node root){
	        if(root ==null) return Integer.MAX_VALUE;
	        if(root.left == null && root.right == null) return 1;
	        
	        return 1 + Math.min(helper(root.left), helper(root.right));
	    }
}
