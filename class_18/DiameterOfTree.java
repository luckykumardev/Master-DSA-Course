package class_18;

public class DiameterOfTree {

	public int diameterOfBinaryTree(Node root) {
	        if(root == null){
	            return 0;
	        }
	       int dia = height(root.left) + height(root.right);
	       int ldia = diameterOfBinaryTree(root.left);
	       int rdia = diameterOfBinaryTree(root.right);
	       return Math.max(dia,Math.max(ldia,rdia));
	        
	    }
	    public int height(Node root){
	        if(root == null){
	            return 0;
	        }
	        return 1+Math.max(height(root.left), height(root.right));
	    }

}
