package class_16;

/*
 https://leetcode.com/problems/path-sum/
*/
public class PathSum {
	   public boolean hasPathSum(Node root, int sum) {
	       boolean ans = rec(root, sum, 0);
	        return ans;
	    }
	    private static boolean rec(Node root, int sum, int curr){
	        if(root == null) return false;
	        curr += root.data;
	        
	        if(root.left == null && root.right == null){
	            if(curr == sum) return true;
	            else            return false;
	        }
	        
	        boolean left  = rec(root.left, sum, curr);
	        boolean right = rec(root.right, sum, curr);
	        return left || right;
	    }
}
