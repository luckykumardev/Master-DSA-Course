package class_43;
/*
 https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/
public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
        int n  = prices.length;
        if(n <2) return 0;
        int buy = prices[0];
        int profit = 0;
        for(int i =1; i <n; i++){
            profit = Math.max(profit, prices[i] - buy);
            buy = Math.min(buy, prices[i]);
        }
        
        return profit;
    }
}
