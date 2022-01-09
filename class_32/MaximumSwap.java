package class_32;

public class MaximumSwap {
	public int maximumSwap(int num) {
		int n = (num + "").length();
		int tem = num;
		int arr[] = new int[n];
		while (n > 0) {
			arr[n - 1] = num % 10;
			n--;
			num = num / 10;
		}
		n = arr.length;

		int rMax[] = new int[n];
		rMax[n - 1] = n - 1;
		int maxIdx = n - 1;
		int max = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] > max) {
				max = arr[i];
				maxIdx = i;
				rMax[i] = i;
			} else {
				rMax[i] = maxIdx;
			}
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] < arr[rMax[i]]) { // swap and return

				int temp = arr[i];
				arr[i] = arr[rMax[i]];
				arr[rMax[i]] = temp;

				int aa = 0;
				for (int j = 0; j < n; j++) {
					aa = aa * 10 + arr[j];
				}
				return aa;
			}
		}

		return tem;
	}
}
