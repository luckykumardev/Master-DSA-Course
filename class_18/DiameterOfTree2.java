package class_18;

public class DiameterOfTree2 {
	   
	static class Pair{
	        int height = 0;
	        int diameter  = 0;
	        Pair(int height, int diameter){
	            this.height =  height;
	            this.diameter = diameter;
	        }
	    }
	    
	    
	    public int diameterOfBinaryTree(Node root) {
	        if(root == null) return 0;
	        int diameter = heightAndDiameter(root).diameter;
	        return diameter;
	    }
	    
	    private static Pair heightAndDiameter(Node root){
	        if(root == null){
	            Pair ans = new Pair(0, 0);
	            return ans;
	        }
	        
	        Pair lo =  heightAndDiameter(root.left);
	        Pair ro =  heightAndDiameter(root.right);
	        
	        int height =  1 + Math.max(lo.height, ro.height);
	        int op1 = lo.height + ro.height;
	        int op2 = lo.diameter;
	        int op3 = ro.diameter;
	        int diameter = Math.max(op1, Math.max(op2, op3));
	        Pair ans = new Pair(height, diameter);
	        return ans;
	    }
}
