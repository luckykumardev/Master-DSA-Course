package class_08;
import java.util.Stack;
/*
2 https://leetcode.com/problems/decode-string/
*/
public class DecodeString {
	 public String decodeString(String s) {
	        Stack<Character> st = new Stack<>();
	        for(int i = s.length() -1; i>=0; i--){
	            StringBuilder sb = new StringBuilder();
	            char ch = s.charAt(i);
	            if(ch == '[') continue;
	            if(ch == ']' || (ch >= 'a' && ch <='z') || (ch >= 'A' && ch <='Z')){
	                st.push(ch);
	            }else{                               
	               String num = "" + ch;
	                while(i >0 && Character.isDigit(s.charAt(i-1))){
	                    i--;
	                    num  = s.charAt(i) + num;
	                }
	                
	                int times = Integer.parseInt(num);
	                String curr = "";
	                while(!st.isEmpty() && st.peek() != ']'){
	                    curr = curr + st.pop(); 
	                }
	                st.pop();
	                for(int j =0; j <times; j++){
	                    sb.append(curr);
	                }
	                
	                String ans = sb.toString();
	                for(int k = ans.length() -1; k >=0; k--)
	                    st.push(ans.charAt(k));
	            }
	        }
	        
	        StringBuilder res = new StringBuilder();
	        while(!st.isEmpty())
	            res.append(st.pop());   
	        return res.toString();
	    }
}
