package class_44;
/*
 https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
*/
public class BestTimeToBuyAndSellStockWithCooldown {
	 private int maxProfit(int index, int i, int[] prices) {
	        if (index >= prices.length) 
	            return 0;
	        
	        int x = 0; 
	        if (i == 0) {
	            int buy   =  maxProfit(index + 1, 1, prices) - prices[index];
	            int noBuy =  maxProfit(index + 1, 0, prices); 
	            x = Math.max(buy, noBuy);
	         } else {
	            int sell   = maxProfit(index + 2, 0, prices) + prices[index];
	            int noSell = maxProfit(index + 1, 1, prices);
	            x = Math.max(sell, noSell);
	        }
	        return x;
	    }
	    
	    public int maxProfit(int[] prices) {
	        return maxProfit(0, 0, prices);
	    }
}
