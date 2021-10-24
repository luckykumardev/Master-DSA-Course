package class_14;

import java.util.ArrayList;
import java.util.List;
// print in both order
public class AllIndicesInArray {
	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 1, 2, 3, 2, 2, 2, 21, 3 };
		List<Integer> index = allIndx(arr, 3, 0, new ArrayList<>());
		index.forEach( i->
		   System.out.print(i +" ")
		);

		System.out.println();
	}

	private static List<Integer> allIndx(int[] arr, int x, int i, List<Integer> ans) {
	   
		if(i == arr.length){
			return ans;
		}
		if(arr[i] == x)
			ans.add(i);
	
		allIndx(arr, x, i+1, ans);

		return ans;
	}
}
