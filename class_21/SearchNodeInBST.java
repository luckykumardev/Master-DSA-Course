package class_21;
/*
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 */	
public class SearchNodeInBST {

	public TreeNode searchBST(TreeNode root, int val) {
	    while(root != null)
	    {
	        if(root.val == val) return root;
	        else if(val < root.val) root = root.left;
	        else root = root.right;
	    }
	    return root;
	}
	
	/*public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
            if(root.val == val) return root;
	        else if(val < root.val) return searchBST(root.left, val);
	        else return searchBST(root.right,val);
    }*/
}
