package class_22;
/*
 https://practice.geeksforgeeks.org/problems/delete-nodes-greater-than-k/1/
*/
public class DeleteNodesGreaterThanK {
	 public Node deleteNode(Node root,int k)
     {
         if(root == null)
           return null;
        
        if(root.data >=k){
            return deleteNode(root.left, k);
        }
        else{
            root.right =  deleteNode(root.right, k);
        }
        
        return root;
     }

}
