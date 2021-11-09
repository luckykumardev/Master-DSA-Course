package class_18;

import java.util.HashMap;

public class DiameterOfTree3 {
	public int diameterOfBinaryTree(Node root) {
	       HashMap<Node, Integer> hm = new HashMap();
	    
	        int ans = diameterOfBinaryTreeHelper(root, hm);
	        return ans;
	    }
	    private int diameterOfBinaryTreeHelper(Node root,HashMap<Node, Integer> hm){
	        if(root == null) return 0;
	        int op1  = height(root.left, hm) + height(root.right,hm);
	        int op2  = diameterOfBinaryTreeHelper(root.left,hm);
	        int op3  = diameterOfBinaryTreeHelper(root.right, hm);
	        return Math.max(op1, Math.max(op2, op3));
	        
	    }
	    private int height(Node root,HashMap<Node, Integer> hm){
	        if(root == null) return 0;
	        if(hm.containsKey(root)) return hm.get(root);
	        hm.put(root, 1 + Math.max(height(root.left, hm), height(root.right,hm)));
	        return 1 + Math.max(height(root.left, hm), height(root.right, hm));
	    }
}
