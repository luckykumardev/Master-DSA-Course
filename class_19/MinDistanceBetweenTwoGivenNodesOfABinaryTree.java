package class_19;

import java.util.LinkedList;
import java.util.Queue;
/*
 https://practice.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1
*/
public class MinDistanceBetweenTwoGivenNodesOfABinaryTree {

	int findDist(Node root, int a, int b) {
        if(root == null) return -1;
        Node lca = helper(root, a, b);
        int lca_a_distance =  distance(lca, a);
        int lca_b_distance =  distance(lca, b);
        
        return lca_a_distance + lca_b_distance-2;
    }
    
    public int distance(Node root, int x){
        int dis =0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            dis++;
            for(int i =0; i<size; i++){
             Node temp = q.poll();
             if(temp.val == x) return dis;
                if(temp.left != null)
                  q.add(temp.left);
                  
                if(temp.right != null)
                  q.add(temp.right);
            }
            
        }
        
        return dis;
    }
    
	public Node helper(Node root, int p, int q){
	        if(root == null) return null;
	        if(root.val == p) return root;
	        if(root.val == q) return root;
	        
	        Node left =  helper(root.left, p, q);
	        Node right = helper(root.right, p, q);
	      
	        if(left == null && right == null) return null;
	        if(left != null && right == null) return left;
	        if(left == null && right != null) return right;
	        
	        return root;
	    }

}
