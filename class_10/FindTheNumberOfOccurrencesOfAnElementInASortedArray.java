package class_10;
/*
 
 https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1

*/

/*
 * Input: arr = [4, 4, 8, 8, 8, 15, 16, 23, 23, 42], target = 8
 * Output: 3
 */
public class FindTheNumberOfOccurrencesOfAnElementInASortedArray {

	public static void main(String[] args) {
		System.out.println(searchRange());
	}
	public static int searchRange() {
      
		int arr[] ={4, 4, 8, 8, 8, 8, 8,  15, 16, 23, 23, 42};
		int ans[] = new int[2];
        ans[0] = BS1(arr, 8);
        ans[1] = BS2(arr, 8);
   
        return ans[1]-ans[0] +1;
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
