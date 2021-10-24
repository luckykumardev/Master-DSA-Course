package class_16;

import java.util.List;

import class_15.TreeNode;

public class MaxDepthOfTreeDfs {
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
	
		int depth = depthOfTreeDFS(root);
		System.out.println(depth);
	}

	private static int depthOfTreeDFS(TreeNode root) {
	    if(root == null)
	    	return 0;
	      List<TreeNode> children = root.children;
	      int ans = 0;
	      int size = children.size();
	      for(int i =0; i<size; i++){
	    	  ans = Math.max(ans, depthOfTreeDFS(children.get(i)));
	      }
	  
		return 1 + ans;
	}
}
