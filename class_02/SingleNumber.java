package class_02;

public class SingleNumber {
	
	public static void main(String[] args) {
	    int nums[] = {2, 2, 1, 1, 4, 3, 3};
	    int ans = 0;
	    for(int i =0; i < nums.length; i++){
	    	ans = ans^nums[i];
	    }
	    
	    System.out.println(ans);
	}
}
