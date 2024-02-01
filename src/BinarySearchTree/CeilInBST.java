package BinarySearchTree;

public class CeilInBST {

	public static class Node
	{
		int data;
		Node left;
		Node right;
		
		
		Node(int d)
		{
			data=d;
			left=null;
			right=null;
			
		}
	}
	
	 public  static int findCeil(Node node, int x) {

	        Node ceil=null;
	        Node curr=node;

	      while(curr!=null)
	      {
	          if(curr.data>=x)
	          {
	              
	               ceil=curr;
	              curr=curr.left;
	             
	          }
	          else
	          {
	              curr=curr.right;
	          }
	      }
	      if(ceil==null)
	      return -1;
	      
	      return ceil.data;

	    }
	
	
	
	
	
	
}
