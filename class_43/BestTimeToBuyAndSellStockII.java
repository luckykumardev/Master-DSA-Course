package class_43;
/*
 https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
*/
public class BestTimeToBuyAndSellStockII {
	 public int maxProfit(int[] prices) {
	        int ans = rec(prices, 0, true);
	        return ans;
	    }
	    
	    private static int rec(int prices[], int i, boolean buyOrSell){
	        if(i == prices.length)
	            return 0;
	    
	        int maxProfit = 0;
	        if(buyOrSell){
	            int buy  = rec(prices, i+1, false) - prices[i];
	            int skip = rec(prices, i+1, true);
	            
	            maxProfit = Math.max(buy, skip);
	        }else{
	            
	            int sell  = prices[i] + rec(prices, i+1, true);
	            int skip = rec(prices, i+1, false);
	            
	            maxProfit = Math.max(sell, skip);    
	        }
	        
	        return maxProfit;
	    }
}
