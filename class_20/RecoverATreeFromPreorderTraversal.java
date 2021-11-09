package class_20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class RecoverATreeFromPreorderTraversal {

    public Node recoverFromPreorder(String traversal) {
        HashMap<Node, Integer> hm = new HashMap<>();
        List<Node> preOrder = new ArrayList<>();
        int level = 0;
        for(int i =0; i< traversal.length(); i++){
            if(traversal.charAt(i) != '-'){
             StringBuilder number = new StringBuilder();
             while(i< traversal.length() && traversal.charAt(i) != '-'){
                 number.append(traversal.charAt(i));
                 i++;
             }
             int data =  Integer.valueOf(number.toString());
             Node node = new Node(data);
             hm.put(node, level);
             preOrder.add(node);
             level = 0;
             
            }else{
                level++;
            }
        }
        Node root = helper(0, preOrder.size()-1, preOrder, hm);

      return root;
    }
    
    Node helper(int i, int last, List<Node> preOrder, HashMap<Node, Integer> hm){
        if(i > last) return null;
        
        Node root = preOrder.get(i);
        if(i == last) return root;
        
        int i_left = i+1;
        int last_left = 0;
        for(int k =i_left; k<=last; k++){
            if(k != i_left && hm.get(preOrder.get(i_left)) == hm.get(preOrder.get(k))){
                last_left =k-1;
                break;
            }
            if(k == last){
	            last_left = last;
	        }   
        }
        
        root.left  = helper(i_left, last_left, preOrder, hm);
        root.right = helper(last_left+1, last, preOrder, hm);
        
        return root;
    }
}
