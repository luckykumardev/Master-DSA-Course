package class_10;

public class binarySearchRecursive {

	int binarySearch(int arr[], int x){
		return binarySearchHelper(arr, 0, arr.length -1, x);
	}
	
	int binarySearchHelper(int arr[], int l, int r, int x) {
		
		if (r >= l) {
			int mid = l + (r - l) / 2;

			if (arr[mid] == x)
				return mid;

			if (arr[mid] > x)
				return binarySearchHelper(arr, l, mid - 1, x);

			return binarySearchHelper(arr, mid + 1, r, x);
		}

		return -1;
	}
}
