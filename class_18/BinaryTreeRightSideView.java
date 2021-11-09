package class_18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 https://leetcode.com/problems/binary-tree-right-side-view/
*/
public class BinaryTreeRightSideView {
	public List<Integer> rightSideView(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i <size; i++){
                  if(i == size -1)
                  list.add(q.peek().val);
                  Node temp = q.poll();
                  
                  if(temp.left != null)
                   q.add(temp.left);
                  if(temp.right != null)
                   q.add(temp.right);
            }
        }
        return list;
    }
}
