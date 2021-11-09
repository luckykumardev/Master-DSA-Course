package class_19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/*
 * https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1
 */	
public class TopViewOfBinaryTree {

	    static class Data{
		        Node node;
		        int hd=0;
		        
		         Data(Node node, int hd){
		             this.node = node;
		             this.hd = hd;
		         }
		    }
	 
	    static ArrayList<Integer> topView(Node root)
	    {
	            ArrayList<Integer> ans = new ArrayList<>();
		         Queue<Data> q = new LinkedList();
		         if(root == null) 
		           return ans;
		          
		         HashMap<Integer, Data> hm = new HashMap<>(); 
		         int min = 0;
		         int max = 0;
		         q.add(new Data(root, 0)); 
		         while(!q.isEmpty()){
		             int size = q.size();
		             for(int i =0; i<size; i++){
		              Data temp = q.poll();
		              if(hm.containsKey(temp.hd) == false)
		               hm.put(temp.hd, temp);
		              min = Math.min(min, temp.hd);
		              max = Math.max(max, temp.hd);
		              if(temp.node.left != null){
		                  q.add(new Data(temp.node.left, temp.hd-1));
		              }
		              if(temp.node.right != null){
		                  q.add(new Data(temp.node.right, temp.hd+1));
		              }
		                 
		             }
		         }
		         
		         while(min <= max){
		             if(hm.containsKey(min)){
		                 ans.add(hm.get(min).node.val);
		             }
		             min++;
		         }
		         
		         return ans;
	    }
	    
}
