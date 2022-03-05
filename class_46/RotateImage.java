package class_46;
/*
 https://leetcode.com/problems/rotate-image/
*/
public class RotateImage {
	    public void rotate(int[][] arr) {
	        int n = arr.length;
	        //transpose
	        for(int i =0; i <n; i++){
	            for(int j =i+1; j <n; j++){
	                  int temp   = arr[i][j];
	                  arr[i][j] = arr[j][i];
	                  arr[j][i] = temp;
	            }
	        }
	        
	        //mirror
	        for(int i =0; i <n; i++){
	            for(int j =0; j < n/2; j++){
	                int temp      = arr[i][j];
	                arr[i][j]     = arr[i][n-1-j];
	                arr[i][n-1-j] = temp;
	            }
	        }   
	   }
}
