package BinarySearchTree;

public class FloorInBST {

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
	
	 public static int floorInBST(Node root, int x) {
	      
	        
	        Node floor=null;
	        Node curr=root;

	      while(curr!=null)
	      {
	          if(curr.data<=x)
	          {
	              
	               floor=curr;
	              curr=curr.right;
	             
	          }
	          else
	          {
	              
	              curr=curr.left;
	          }
	      }
	      
	      if(floor==null)
	    	  return -1;
	      
	      return floor.data;
	    }
	
	
	
	
	
	
	
}
