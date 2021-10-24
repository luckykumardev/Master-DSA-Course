package class_16;

import java.util.ArrayList;
import java.util.List;

/*
 https://leetcode.com/problems/binary-tree-inorder-traversal/
*/
public class Inorder {

	 public List<Integer> inorderTraversal(Node root) {
	        List<Integer> ans = new ArrayList();
	        helper(root, ans);
	        return ans;
	    }
	    
	    private void helper(Node root, List<Integer> ans){
	        if(root == null){
	            return;
	        }
	        helper(root.left, ans);
	        ans.add(root.data);
	        helper(root.right, ans);
	        
	    }

}
