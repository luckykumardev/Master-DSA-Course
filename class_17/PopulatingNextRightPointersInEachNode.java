package class_17;
/*
 https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
*/
public class PopulatingNextRightPointersInEachNode {
	  public Node connect(Node root) {
	        if(root == null || (root.left == null && root.right ==null)) 
	            return root;
	        
	        Node curr = root;
	        while(curr != null){
	          Node temp = curr;
	            while(temp != null){
	                if(temp.left != null)
	                    temp.left.next = temp.right;
	                if(temp.next != null && temp.right != null){
	                    temp.right.next = temp.next.left;
	                }
	                temp = temp.next;
	            }
	            
	            
	          curr = curr.left;
	        }

	        return root;
	    }
}
