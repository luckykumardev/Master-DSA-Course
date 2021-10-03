package class_09;

import java.util.Stack;

public class AsteroidCollisions {
	 public int[] asteroidCollision(int[] asteroids) {
	        int n = asteroids.length;
	        Stack<Integer> s = new Stack<>();
	        for(int i =0; i <n; i++){
	            int x = asteroids[i];
	            if(s.isEmpty() || x>0)
	                s.push(x);
	            else{
	                boolean flag = false;
	                while(!s.isEmpty() && s.peek() > 0){
	                    if(x*-1 < s.peek()){
	                         flag = true;
	                         break;
	                    }
	                    else if(x*-1 == s.peek()){
	                         s.pop();
	                         flag = true;
	                         break;
	                    }
	                    else{
	                        
	                        s.pop();
	                    }
	                }
	                
	                if(!flag) s.push(x);
	            }
	        }
	        
	        int ans[] = new int[s.size()];
	        int c = s.size()-1;
	        while(!s.isEmpty())
	            ans[c--] = s.pop(); 
	        
	        return ans;
	    }

}
