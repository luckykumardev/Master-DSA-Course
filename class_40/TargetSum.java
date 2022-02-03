package class_40;

import java.util.HashMap;

/*
 https://leetcode.com/problems/target-sum/
*/
public class TargetSum {
    public int findTargetSumWays(int[] nums, int S) {
        HashMap<String, Integer> hm = new HashMap<>();
        int ans = rec(nums, S, 0, 0, hm);
        return ans;
    }
    
    private static int rec(int nums[], int sum, int i, int curr, HashMap<String, Integer> hm){
        
        if(i == nums.length){
            if(curr == sum) return 1;
            else            return 0;
        }
            
            String key = i + "#" + curr;
            if(hm.containsKey(key)){
                return hm.get(key);
            }
        
            int op1 = rec(nums, sum, i+1, curr + nums[i], hm);
            int op2 = rec(nums, sum, i+1, curr - nums[i], hm);
            hm.put(key, op1+op2);
            return op1 + op2;
        }
}
