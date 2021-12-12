package class_21;
/*
 https://practice.geeksforgeeks.org/problems/inorder-successor-in-bst/1/
*/
public class InorderSuccessorInBST {
	public Node inorderSuccessor(Node root,Node x)
    {  
         Node ans = null;
         while(root != null){
           if(root.data <= x.data){
               root = root.right;
           }
           else{
               ans = root;
               root = root.left;
           }
         }    
         return ans;
    }
}
