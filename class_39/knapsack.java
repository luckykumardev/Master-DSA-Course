package class_39;

import java.util.HashMap;

public class knapsack {

	public static int findKnapsack(int weights[], int values[], int maxWeight) {
		HashMap<String, Integer> mhm = new HashMap<>();
		return findKnapsackHelper(weights, values, maxWeight, 0, mhm);
	}

	
	public static int findKnapsackHelperR(int weights[], int values[], int maxWeight, int i) {
		if (i == weights.length || maxWeight == 0) {
			return 0;
		}
		if (weights[i] > maxWeight) {
			return findKnapsackHelperR(weights, values, maxWeight, i + 1);
		} else {
			int op1 = values[i] + findKnapsackHelperR(weights, values, maxWeight - weights[i], i + 1);
			int op2 = findKnapsackHelperR(weights, values, maxWeight, i + 1);

			return Math.max(op1, op2);
		}
	}
	
	
	public static int findKnapsackHelper(int weights[], int values[], int maxWeight, int i, HashMap<String, Integer> mhm) {
		if (i == weights.length || maxWeight == 0) {
			return 0;
		}

		String key = maxWeight + "#" + i;
		if (mhm.containsKey(key)) {
			return mhm.get(key);
		}

		if (weights[i] > maxWeight) {
			return findKnapsackHelper(weights, values, maxWeight, i + 1, mhm);
		} else {
			// include the ith item
			int op1 = values[i] + findKnapsackHelper(weights, values, maxWeight - weights[i], i + 1, mhm);
			// don't include
			int op2 = findKnapsackHelper(weights, values, maxWeight, i + 1, mhm);

			mhm.put(key, Math.max(op1, op2));
			return Math.max(op1, op2);
		}
	}
}
