package class_02;

/* 
 * discuss all approaches
 * recursive, bit manipulation and Kernigan approach
 */
public class PowerofTwo {
	  public boolean isPowerOfTwo(int n) {
	        int count_On_bits = kerniganAlgo(n);
			if(count_On_bits == 1) return true;
	        return false;
		}

		private  int kerniganAlgo(int x) {
		  int count  = 0;
		  while(x > 0){
			  int mask = ~(x&(1 + (~x)));
			  x = x&mask;
			  count++;
		  }
			
		  return count;
		}
}
