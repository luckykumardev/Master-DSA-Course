package class_34;

import java.util.HashMap;

public class DotProductOfTwoSparseVectors {
	HashMap<Integer, Integer> indexValueMap = new HashMap<>();

	DotProductOfTwoSparseVectors(int[] nums) {
        int n = nums.length;
        for(int i =0; i<n; i++){
            if(nums[i] == 0) continue;
            indexValueMap.put(i, nums[i]);
        }
        
        
    }

	// Return the dotProduct of two sparse vectors
	public int dotProduct(DotProductOfTwoSparseVectors vec) {
		int dotProduct = 0;
	
		for (Integer idx : vec.indexValueMap.keySet()) {
			if (indexValueMap.containsKey(idx) == false)
				continue;
			dotProduct += indexValueMap.get(idx) * vec.indexValueMap.get(idx);
		}

		return dotProduct;
	}
}
