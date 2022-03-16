package class_49;
/*
 -  https://leetcode.com/problems/jump-game/ 
 -  nums  = [ 2,  3,  1,  1,  4]           
              0   1   2   3   4     
*/
public class JumpGameGreedy {
	 public boolean canJump(int[] nums) {
	        int n = nums.length;
	        if(n == 0) return true;
	        
	        int reach = nums[0];
	        for(int i =0; i <= reach; i++){
	            reach = Math.max(reach, i + nums[i]);
	            if(reach >= n-1)
	                return true;
	        }
	        
	        return false;
	    }
}