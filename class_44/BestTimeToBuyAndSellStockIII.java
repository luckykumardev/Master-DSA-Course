package class_44;

/*
 https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
*/
public class BestTimeToBuyAndSellStockIII {
	private int maxProfit(int i, int buyOrSell, int[] prices, int k) {
		if (i >= prices.length || k == 0)
			return 0;

		int x = 0;
		if (buyOrSell == 0) {
			int buy = maxProfit(i + 1, 1, prices, k) - prices[i];
			int noBuy = maxProfit(i + 1, 0, prices, k);
			x = Math.max(buy, noBuy);
		} else {
			int sell = maxProfit(i + 1, 0, prices, k - 1) + prices[i];
			int noSell = maxProfit(i + 1, 1, prices, k);
			x = Math.max(sell, noSell);
		}
		return x;
	}

	public int maxProfit(int[] prices) {
		return maxProfit(0, 0, prices, 2);
	}
}
