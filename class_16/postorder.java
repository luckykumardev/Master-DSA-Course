package class_16;

import java.util.ArrayList;
import java.util.List;

public class postorder {
	 public List<Integer> postOrderTraversal(Node root) {
	        List<Integer> ans = new ArrayList();
	        helper(root, ans);
	        return ans;
	    }
	    
	    private void helper(Node root, List<Integer> ans){
	        if(root == null){
	            return;
	        }
	        helper(root.left, ans);
	        helper(root.right, ans);
	        ans.add(root.data); 
	    }

}
