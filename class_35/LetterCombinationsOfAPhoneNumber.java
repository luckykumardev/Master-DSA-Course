package class_35;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 https://leetcode.com/problems/letter-combinations-of-a-phone-number/
*/
public class LetterCombinationsOfAPhoneNumber {
	public List<String> letterCombinations(String digits) {
	       Map<Character, String> hm = new HashMap<>();
	        hm.put('2', "abc");
	        hm.put('3', "def");
	        hm.put('4', "ghi");
	        hm.put('5', "jkl");
	        hm.put('6', "mno");
	        hm.put('7', "pqrs");
	        hm.put('8', "tuv");
	        hm.put('9', "wxyz");
	        List<String> ans = new ArrayList<>();
	        if(digits.length() == 0) return ans;
	        func(digits, hm , ans, "");
	        return ans;
	    }
	    
	    private void func(String digits, Map<Character, String> hm ,List<String> ans, String res){
	       if(digits.length() == 0){
	          ans.add(res);
	           return;
	       }
	        char c = digits.charAt(0);
	        String possibily =hm.get(c);
	        
	        for(int j = 0; j <possibily.length(); j++){
	            res += possibily.charAt(j);
	            func(digits.substring(1), hm , ans, res);
	            res = res.substring(0, res.length()-1);
	        }
	    }
}
