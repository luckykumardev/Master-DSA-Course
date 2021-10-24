package class_14;

public class LastIndexOfElement {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 1, 2, 3, 2, 2, 2,21, 3};
		int index = lastIndx(arr, 3, 0);
		System.out.println(index);
	}

	private static int lastIndx(int[] arr, int x, int i) {
		if (i == arr.length)
			return -1;
		
		int ans =lastIndx(arr, x, i + 1); 
		if(ans != -1)
			return ans;
		else if(arr[i] == x){
			return i;
		}else{
			return -1;
		}
	
	}
}
