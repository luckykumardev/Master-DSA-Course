package class_18;

/*
 * https://leetcode.com/problems/find-bottom-left-tree-value/
*/	
public class FindBottomLeftTreeValue {
	   public int findBottomLeftValue(Node root) {
	        return findBottomLeftValue(root, 1, new int[]{0,0});
	    }
	    public int findBottomLeftValue(Node root, int depth, int[] res) {
	        if (res[1]<depth) {res[0]=root.val;res[1]=depth;}
	        if (root.left!=null) findBottomLeftValue(root.left, depth+1, res);
	        if (root.right!=null) findBottomLeftValue(root.right, depth+1, res);
	        return res[0];
	    }
}
