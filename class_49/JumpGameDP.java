package class_49;
/*
 https://leetcode.com/problems/jump-game/
*/
public class JumpGameDP {
	  private boolean reachLast(int[] nums, int curIdx) {
	        if (curIdx == nums.length - 1)
	            return true;   
	        if (curIdx < 0 || curIdx >= nums.length || nums[curIdx] == 0)
	            return false;
	        
	        boolean result = false;
	        for (int i = 1; i <= nums[curIdx]; i++)
	            result = result || reachLast(nums, curIdx + i);    
	        return result;
	    }
	    
	    public boolean canJump(int[] nums) {
	        return reachLast(nums, 0);
	    }
}
