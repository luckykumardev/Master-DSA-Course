package class_41;


/*
 * N = 8
   Price[] = {1, 5, 8, 9, 10, 17, 17, 20}
*/
public class RodCutting {

	    public static void main(String[] args) {
       	  	int  price[] = {1, 5, 8, 9, 10, 17, 17, 20};
	    
       	  	System.out.println(cutRod(price, 8));
	    }
	
	    public static int cutRod(int price[], int n) {
	        
	        int len[] = new int[price.length];
	        for(int i =0; i <n; i++)
	         len[i] = i+1;
	        
	        return  knapSackRecursion(len.length, len, price, 0, 0);
	    }
	    
	    static int knapSackRecursion(int W, int wt[], int val[], int i, int currSum) {
			if (i == wt.length || W == 0) {
				return currSum;
			}

			if (wt[i] <= W) {
				int op1 = knapSackRecursion(W - wt[i], wt, val, i, currSum + val[i]);
				int op2 = knapSackRecursion(W, wt, val, i + 1, currSum);

				return Math.max(op1, op2);
			} else {
				int op2 = knapSackRecursion(W, wt, val, i + 1, currSum);
				return op2;
			}
		}

}
