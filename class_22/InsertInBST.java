package class_22;

/*
 https://leetcode.com/problems/insert-into-a-binary-search-tree/
*/
public class InsertInBST {
	 public TreeNode insertIntoBST(TreeNode root, int val) {
	        if(root == null){
	            return new TreeNode(val);
	        }
	        
	        if(root.val > val)
	            root.left = insertIntoBST(root.left, val);
	        if(root.val < val)
	            root.right = insertIntoBST(root.right, val);
	            
	        return root;
	    }
}
