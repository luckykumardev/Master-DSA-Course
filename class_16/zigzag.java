package class_16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
*/
public class zigzag {
public List<List<Integer>> zigzagLevelOrder(Node root) {
        
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;
        while(!q.isEmpty()){
            int size = q.size();
             List<Integer> curr = new ArrayList<>();
            for(int i =0; i <size; i++){
                   Node temp = q.poll();
                    curr.add(temp.data);
                    if(temp.left  != null) q.add(temp.left);    
                    if(temp.right != null) q.add(temp.right);
                }
            
            if(flag == true) flag = false;
            else             flag = true;
        
            if(flag == true) Collections.reverse(curr);
           res.add(curr);
        }
        
        return res;
    }
}
