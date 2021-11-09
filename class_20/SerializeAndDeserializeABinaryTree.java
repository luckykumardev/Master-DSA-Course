package class_20;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeABinaryTree {
	    
	    public String serialize(Node root) {
	        if(root == null) return "X";
	        String leftSerialize = serialize(root.left);
	        String rightSerialize = serialize(root.right);
	        
	        return root.val+","+leftSerialize+","+rightSerialize;
	    }

	    public Node deserialize(String data) {
	        String arr[] = data.split(",");
	        Queue<String> q = new LinkedList<>();
	        for(int i =0; i <arr.length; i++)
	             q.add(arr[i]);
	        
	        Node root = deseriaize(q);
	        return root;
	    }

	    private static Node deseriaize(Queue<String> q){
	        if(q.size() == 0) return null;
	        String peek = q.poll();
	        if(peek.equals("X")) return null;
	        Node root = new Node(Integer.parseInt(peek));
	        root.left = deseriaize(q);
	        root.right = deseriaize(q);
	        return root;
	    }

}
