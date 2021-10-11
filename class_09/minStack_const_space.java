package class_09;

import java.util.Stack;
// 2*r - prev_min = encoded 
public class minStack_const_space {
    Stack<Integer> s;
    int minEle;
 
    minStack_const_space() { 
    	s = new Stack<Integer>(); 
    }
 
    int getMin()
    {
        if (s.isEmpty())
           return -1;
        else
            return minEle;
    }
   
    int pop()
    {
         int ans = -1;
    	if (s.isEmpty())
        {
            return -1;
        }
 
        int t = s.pop();
 
        if (t < minEle)
        {
            ans = minEle;
        	minEle = 2*minEle - t;
        }
 
        else
            System.out.println(t);
        return ans;
    }
 
    void push(int x)
    {
        if (s.isEmpty())
        {
            minEle = x;
            s.push(x);
            return;
        }
 
        if (x < minEle)
        {
            s.push(2*x - minEle);
            minEle = x;
        }
 
        else
            s.push(x);
    }

}
