package class_18;

/*
 * https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1
 */	
public class LeftViewOfBinaryTree {
	    Node root;
	    static int max_level = 0;
	 
	    void leftViewUtil(Node node, int level)
	    {
	        if (node == null)
	            return;
	 
	        if (max_level < level) {
	            System.out.print(" " + node.val);
	            max_level = level;
	        }
	 
	        leftViewUtil(node.left, level + 1);
	        leftViewUtil(node.right, level + 1);
	    }
	 
	    void leftView()
	    {
	        leftViewUtil(root, 1);
	    }
	    

/*   
	  private static void printLeftView(Node root)
	     {
	        if (root == null)
	            return;
	 
	        Queue<Node> queue = new LinkedList<>();
	        queue.add(root);
	 
	        while (!queue.isEmpty()) {
	            int n = queue.size();
	 
	            for (int i = 1; i <= n; i++) {
	                Node temp = queue.poll();
	 
	                if (i == 1)
	                    System.out.print(temp.val + " ");
	 
	                if (temp.left != null)
	                    queue.add(temp.left);
	 
	                if (temp.right != null)
	                    queue.add(temp.right);
	            }
	        }
	    }
*/
	    
	 
}
