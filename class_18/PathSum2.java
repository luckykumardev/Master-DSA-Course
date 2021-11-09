package class_18;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
	List<List<Integer>> res;
    public List<List<Integer>> pathSum(Node root, int sum) {
        res = new ArrayList<>();
        if(root  == null) return res;
        ArrayList<Integer> curr = new ArrayList<>();
        helper(root, curr, sum, 0);
        return res;
    }
    
    private void helper(Node root, ArrayList<Integer> curr, int total, int sum){
        if(root == null)return;
        if(root.left == null && root.right == null){
            if(total == sum + root.val){          
        	 curr.add(root.val);
             res.add(new ArrayList<>(curr));
             curr.remove(curr.size()-1); 
            }
            return;
        }
        
           curr.add(root.val);
           helper(root.left,  curr, total, sum + root.val);
           helper(root.right, curr, total, sum + root.val);
           curr.remove(curr.size()-1);
    }
}
