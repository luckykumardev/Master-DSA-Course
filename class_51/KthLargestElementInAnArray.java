package class_51;

import java.util.PriorityQueue;

/*
 https://leetcode.com/problems/kth-largest-element-in-an-array/
*/	

public class KthLargestElementInAnArray {
	   public int findKthLargest(int[] nums, int k) {
	        PriorityQueue<Integer> pq = new PriorityQueue<>();
	        for(int i =0; i <k; i++)
	            pq.add(nums[i]);
	        
	        for(int i =k; i <nums.length; i++){
	            if(pq.peek() < nums[i]){
	                pq.poll();
	                pq.add(nums[i]);
	            }
	        }
	        
	      return pq.peek();  
	    }
}
