package class_41;

import java.util.HashMap;
import java.util.Map;

/*
 https://leetcode.com/problems/coin-change/submissions/
*/	
/*
  Input: coins = [1,2,5], amount = 11 
  Output: 3
  Explanation: 11 = 5 + 5 + 1
*/
public class CoinChange {
	
	static Map<String, Integer> memo;
	public static void main(String[] args) {
	   int coins[] = {1, 2, 5};
	   memo = new HashMap<>();
	   int ans  = coinChange(coins,11);
  	   System.out.println(ans);
	}
	
	public static int coinChange(int[] coins, int amount) {
        int ans = isSubsetSum(coins, 0, amount);
		return ans != Integer.MAX_VALUE ? ans : -1;
	}

	static int isSubsetSum(int set[], int i, int sum) {
		if (sum == 0)
			return 0;
		if (i == set.length || sum < 0)
			return Integer.MAX_VALUE;

		String key = i +"codebix" +sum;
		if(memo.containsKey(key)){
			return memo.get(key);
		}
		if (set[i] > sum) {
			int op2 = isSubsetSum(set, i + 1, sum);
			memo.put(key, op2);
			return op2;
		} else {
			int op1 = 1 + isSubsetSum(set, i, sum - set[i]);
			int op2 = isSubsetSum(set, i + 1, sum);
			memo.put(key, Math.min(op1, op2));
			return Math.min(op1, op2);
		}
	}
}
