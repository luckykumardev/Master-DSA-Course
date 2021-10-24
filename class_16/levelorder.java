package class_16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
  https://leetcode.com/problems/binary-tree-level-order-traversal/
*/
public class levelorder {
	   public List<List<Integer>> levelOrder(Node root) {
	        List<List<Integer>> output = new ArrayList<>();
	        if(root==null){
	            return output;
	        }
	        Queue<Node> queue = new LinkedList<>();
	        queue.add(root);
	        while(!queue.isEmpty()){
	            List<Integer> list1 = new ArrayList<>();
	            int size = queue.size();
	            for(int i=0; i<size; i++){
	                Node node = queue.poll();
	                list1.add(node.data);
	                if(node.left!=null){
	                     queue.add(node.left);
	                }
	                if(node.right!=null){
	                     queue.add(node.right);
	                }
	            }   
	            output.add(list1);
	        }
	        return output;
	    }
}
