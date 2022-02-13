package class_42;

import java.util.List;

/*
 https://leetcode.com/problems/triangle/
*/
public class Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 0) return  0;
        int ans  = rec(triangle, 0, 0);
        return ans;
    }
    
    private static int rec(List<List<Integer>> triangle, int r, int i){
        if(r ==  triangle.size()){
            return 0;
        }
        
        int op1 = rec(triangle, r+1, i);
        int op2 = rec(triangle, r+1, i+1);

        return triangle.get(r).get(i) + Math.min( op1, op2);
    }
}
