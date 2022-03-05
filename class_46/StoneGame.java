package class_46;

/*
 https://leetcode.com/problems/stone-game/
*/
public class StoneGame {
	public boolean stoneGame(int[] piles) {
		int totalsum = 0;
		for (int i = 0; i < piles.length; i++)
			totalsum += piles[i];
		boolean ans = helper(piles, 0, 0, 0, piles.length - 1);
		return ans;
	}

	private static boolean helper(int arr[], int alex, int lee, int s, int e) {
		if (s > e) {
			if (alex > lee)
				return true;
			else
				return false;
		}

		// if alex pic from front
		boolean op1 = helper(arr, alex + arr[s], lee + arr[s + 1], s + 2, e);
		boolean op2 = helper(arr, alex + arr[s], lee + arr[e], s + 1, e - 1);

		// if alex pic from last
		boolean op3 = helper(arr, alex + arr[e], lee + arr[e - 1], s, e - 2);
		boolean op4 = helper(arr, alex + arr[e], lee + arr[s], s + 1, e - 1);

		return op1 || op2 || op3 || op4;

	}
}
