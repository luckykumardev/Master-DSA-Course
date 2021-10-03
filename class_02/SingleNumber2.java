package class_02;

public class SingleNumber2 {
	
	public static void main(String[] args) {
		int nums[] = {2, 2 ,2, 3, 3, 4, 3}; 
		
		int ans = 0;
	    for(int i = 0; i < 32; i++) {
	        int sum = 0;
	        for(int j = 0; j < nums.length; j++) {
	            if(((nums[j] >> i) & 1) == 1)
	                sum++;
	        }
	        sum %= 3;
              
	        if(sum != 0) {           // sum can be either 0 or 1
	            ans = ans|(sum << i);
	        }
	    }
	    
	    System.out.println(ans);
	}

}
