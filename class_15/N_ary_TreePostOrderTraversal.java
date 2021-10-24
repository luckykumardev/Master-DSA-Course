package class_15;

import java.util.ArrayList;
import java.util.List;

public class N_ary_TreePostOrderTraversal {

	
	public static void main(String[] args) {
		TreeNode root  = new TreeNode(100);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		node1.children.add(node4);
		
		List<Integer> ans = postorder(root);
		
		ans.forEach( node-> System.out.print(node + " "));
	}
	
	public static List<Integer> postorder(TreeNode root) {
	        
	        List<Integer> ans = new ArrayList<>();
	        helper(root, ans);
	        return ans;
	    }
	   
	private static void helper(TreeNode root, List<Integer> ans){
	        if(root == null) 
	            return;
	        
	        
	       List<TreeNode> children = root.children;
	       for(int i =0; i <children.size(); i++){
		      helper(children.get(i), ans);
		   }
		       
	        ans.add(root.data);
	     }
	  
}

