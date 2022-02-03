package class_40;

import java.util.HashMap;
import java.util.Map;

/*
  https://www.interviewbit.com/problems/subset-sum-problem/
*/
public class SubsetSum {

	public static Boolean isSubsetSumHelper(int arr[], int sum, int i, Map<String, Boolean> hm) {

		String key = sum + "#" + i;
		if (hm.containsKey(key))
			return hm.get(key);

		if (sum == 0)
			return true;
		if (i == arr.length)
			return false;

		if (arr[i] > sum) {
			boolean op = isSubsetSumHelper(arr, sum, i + 1, hm);
			hm.put(key, op);
			return op;
		} else {
			boolean op1 = isSubsetSumHelper(arr, sum - arr[i], i + 1, hm);
			boolean op2 = isSubsetSumHelper(arr, sum, i + 1, hm);
			//hm.put(key, op2 || op1);
		//	return op2 || op1;
		
		    if(op1 == true || op2 == true)
		    	return true;
		    else
		    return false;
		}
	}

	public static void main(String args[]) {
		int set[] = { 3, 34, 4, 12, 5, 2 };
		int sum = 9;
		Map<String, Boolean> hm = new HashMap<>();
		if (isSubsetSumHelper(set, 0, sum, hm) == true)
			System.out.println("Found a subset" + " with given sum");
		else
			System.out.println("No subset with" + " given sum");
	}

}