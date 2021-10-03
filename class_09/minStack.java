package class_09;

import java.util.Stack;

// O(N) space
public class minStack {
	Stack<Integer>  s;
    Stack<Integer> ms;
    
    public minStack() {
        s = new Stack<>();
        ms = new Stack<>();
    }
    
    public void push(int x) {
        s.push(x);
        if(ms.isEmpty() || ms.peek() >= x)
             ms.push(x);
        else
             ms.push(ms.peek());
    }
    
    public void pop() {
        s.pop();
        ms.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return ms.peek();
    }

}
