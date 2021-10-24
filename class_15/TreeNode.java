package class_15;

import java.util.ArrayList;

public class TreeNode {
  public int data;
  public ArrayList<TreeNode> children;
  
  public TreeNode(int data){
	  this.data  = data;
	  children = new ArrayList<>();
  }
}
