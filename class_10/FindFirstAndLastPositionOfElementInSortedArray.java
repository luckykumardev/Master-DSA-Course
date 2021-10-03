package class_10;

/*
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

	public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = BS1(nums, target);
        ans[1] = BS2(nums, target);
   
        return ans;
     }
    
    private static int BS2(int nums[], int t){
        int l =0;
        int r = nums.length -1;
        int i = -1;
        while(l<=r){
            int m = l + (r-l)/2;
            if(nums[m] == t){
                i =  m;
                l = m+1;
            }
            if(nums[m] > t){
                r = m-1;
            }else{
                l = m+1;
            }
        }
        return i;
    }
    
    private static int BS1(int nums[], int t){
        int l =0;
        int r = nums.length -1;
        int i = -1;
        while(l<=r){
            int m = l + (r-l)/2;
            if(nums[m] == t){
                i =m;
                r = m-1;
            }
            if(nums[m] < t){   
                l = m+1;
            }else{
                r = m-1;
            }
        }
        return i;
    }
    
}
