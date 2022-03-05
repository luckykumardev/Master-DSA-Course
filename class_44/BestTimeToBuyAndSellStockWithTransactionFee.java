package class_44;

import java.util.HashMap;
/*
 https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
*/
public class BestTimeToBuyAndSellStockWithTransactionFee {
	public int maxProfit(int[] prices, int fee) {
		HashMap<String, Integer> hm = new HashMap<>();
		int ans = rec(prices, 0, 0, fee, hm);
		return ans;
	}

	private static int rec(int prices[], int i, int buyOrSell, int fee, HashMap<String, Integer> hm) {
		if (i == prices.length)
			return 0;

		String key = i + "codebix" + buyOrSell;
		if (hm.containsKey(key))
			return hm.get(key);
		int profit = 0;
		if (buyOrSell == 0) {
			int buy = rec(prices, i + 1, 1, fee, hm) - prices[i];
			int skip = rec(prices, i + 1, 0, fee, hm);
			profit = Math.max(buy, skip);
		} else {
			int sell = rec(prices, i + 1, 0, fee, hm) + prices[i] - fee;
			int skip = rec(prices, i + 1, 1, fee, hm);
			profit = Math.max(sell, skip);
		}

		hm.put(key, profit);
		return profit;
	}
}
