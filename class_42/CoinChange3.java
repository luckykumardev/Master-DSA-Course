package class_42;

//permutations - unbounded knapsack

/*
 Input: amount = 3, coins = [1,2,3,5]
 Output: 4
 Explanation: there are four ways to make up the amount:
 3=3
 3=1+2
 3=1+1+1
 3=2+1
*/
public class CoinChange3 {

	public static void main(String[] args) {
		int coins[] = { 1, 2, 3, 5 };
		int ans = change(3, coins);
		System.out.println(ans);
	}

	public static int change(int amount, int[] coins) {
		return isSubsetSum(coins, 0, amount);
	}

	static int isSubsetSum(int set[], int i, int sum) {
		if (sum == 0)
			return 1;
		if (i == set.length || sum < 0)
			return 0;

		if (set[i] > sum) {
			int op2 = isSubsetSum(set, i + 1, sum);
			return op2;
		} else {
			int op1 = isSubsetSum(set, 0, sum - set[i]);
			int op2 = isSubsetSum(set, i + 1, sum);
			return op2 + op1;
		}
	}
}
