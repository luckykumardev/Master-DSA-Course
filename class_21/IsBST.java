package class_21;

import java.util.ArrayList;

/*
 https://leetcode.com/problems/validate-binary-search-tree/
*/
public class IsBST {
	  public boolean isValidBST(TreeNode root) {
	       ArrayList<Integer> a1 = new ArrayList<>();
	       helper(root, a1);
	       if(a1.size() == 1) return true;
	        for(int i =1 ; i <a1.size(); i++)
	            if(a1.get(i-1) >= a1.get(i)) return false;
	       return true;
	    }
	    
	    private static void helper(TreeNode root, ArrayList<Integer> a1){
	        if(root == null) return;
	        helper(root.left, a1);
	         a1.add(root.val);
	        helper(root.right, a1);
	      }
}
