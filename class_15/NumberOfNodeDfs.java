package class_15;

import java.util.List;

public class NumberOfNodeDfs {

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
	
		int no_node = numberOfNodeDFS(root);
		System.out.println(no_node);
	}

	private static int numberOfNodeDFS(TreeNode root) {
	    if(root == null)
	    	return 0;
	      List<TreeNode> children = root.children;
	      int ans = 1;
	      int size = children.size();
	      for(int i =0; i<size; i++){
	    	  ans +=numberOfNodeDFS(children.get(i));
	      }
	  
		return ans;
	}
}
