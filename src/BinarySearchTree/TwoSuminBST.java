package BinarySearchTree;
import java.util.*;

public class TwoSuminBST {

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
	
	


	class BSTIterator {

	    Stack<Node> st=new Stack<Node>();

	    boolean before=true;

	    public BSTIterator(Node root,boolean bef) {

	    	before=bef;
	    	pushAll(root);
	        
	        
	    }
	    
	    public int next() {

	        Node curr=st.pop();
	        if(before==false)
	        pushAll(curr.right);
	        else
	        pushAll(curr.left);
	        return curr.data;
	        
	    }
	    
	    public boolean hasNext() {
	        
	        return st.size()>0;
	    }

	    public void pushAll(Node node)
	    {
	        while(node!=null)
	        {
	            st.push(node);
	            if(before==false)
	            node=node.left;
	            else
	            node=node.right;
	        }
	    }
	}
	
	


	    
	    public boolean findTarget(Node root, int k) {

	        if(root==null)
	        return false;

	        BSTIterator a=new BSTIterator(root,false);
	        BSTIterator b=new BSTIterator(root,true);

	        int i=a.next();
	        int j=b.next();

	        while(i<j)
	        {
	           
	            if(i+j==k)
	            return true;

	            else if(i+j<k)
	            i=a.next();

	            else
	            j=b.next();
	        }

	        return false;
	        
	    }
	}

	
	
	
	
	

