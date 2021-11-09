package class_18;
/*
 https://www.geeksforgeeks.org/full-and-complete-binary-tree-from-given-preorder-and-postorder-traversals/
*/
public class ConstructFullBinaryTreeFromGivenPreorderAndPostorder {

    static Node constructTreeHelper(int preindex, int pre[], int post[], int l,
                                   int h, int size)
    {
        if (preindex >= size || l > h)
            return null;
    
        Node root = new Node(pre[preindex]);
        preindex++;
        if (l == h || preindex >= size)
            return root;
        int i;
         
        for (i = l; i <= h; i++)
        {
            if (post[i] == pre[preindex])
                break;
        }
 
        if (i <= h)
        {
            root.left = constructTreeHelper(preindex,pre, post, l, i, size);
            root.right = constructTreeHelper(preindex, pre, post, i + 1, h-1, size);
        }
        return root;
    }
 
    static Node constructTree(int pre[], int post[], int size)
    {
        return constructTreeHelper(0 , pre, post, 0, size - 1, size);
    }
 
}