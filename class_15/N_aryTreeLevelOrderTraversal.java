package class_15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class N_aryTreeLevelOrderTraversal {

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

		levelOrder(root);
	    
	}
	
	 public static void levelOrder(TreeNode root) {
	        if(root ==  null) return ;
	        Queue<TreeNode> q = new LinkedList();
	        q.add(root);
	        while(!q.isEmpty()){
	           int size = q.size();
	           for(int i =0; i <size; i++){
	               TreeNode temp = q.poll();
                   System.out.print(temp.data + " ");	                
	               for(int j =0; j<temp.children.size(); j++)
	                  q.add(temp.children.get(j));
	            }   
	          System.out.println();
	        }
	    }
}