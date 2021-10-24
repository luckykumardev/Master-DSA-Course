package class_13;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[] = {1,3,-4,1,2};
		
		int ans  = findSum(arr, 0);
		System.out.println(ans);
		
	}

	private static int findSum(int[] arr, int i) {
	     if(i == arr.length)
	    	 return 0;
	     int ans =  arr[i] + findSum(arr, i+1);
		return ans;
	}
	
}
