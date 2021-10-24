package class_16;

import java.util.ArrayList;
import java.util.List;

public class preorder {
	 public List<Integer> preOrderTraversal(Node root) {
	        List<Integer> ans = new ArrayList();
	        helper(root, ans);
	        return ans;
	    }
	    
	    private void helper(Node root, List<Integer> ans){
	        if(root == null){
	            return;
	        }
	        ans.add(root.data); 
	        helper(root.left, ans);
	        helper(root.right, ans);
	    }

}
