package class_14;

public class FirstIndexOfNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 1, 2, 3 };
		int index = firstIndx(arr, 3, 0);
		System.out.println(index);
	}

	private static int firstIndx(int[] arr, int x, int i) {
		if (i == arr.length)
			return -1;

		if (arr[i] == x) 
			return i;
		
		return firstIndx(arr, x, i + 1);
	}
}
