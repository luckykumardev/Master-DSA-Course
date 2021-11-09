package class_18;


/*
 https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
*/
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
	 public Node buildTree(int[] preorder, int[] inorder) {
	        
		 Node root = construct(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
	        return root;
	    }
	    
	    private static Node construct(int pre[], int in[], int pre_s, int pre_e, int in_s, int in_e){
	        if(pre_s > pre_e && in_s > in_e) return null;
	        Node root = new Node(pre[pre_s]);
	        int idx = findIndex(in, pre[pre_s]);
	        int len = idx - in_s;
	        
	        root.left  = construct(pre, in, pre_s+1, pre_s+len, in_s, len-1);
	        root.right = construct(pre, in, pre_s+len +1, pre_e, idx+1, in_e);
	        
	        return root;
	    }
	    
	    private static int findIndex(int ino[], int x){
	        for(int i =0; i<ino.length; i++){
	            if(ino[i] == x) return i;
	        }
	        return -1;
	    }
	    
}
