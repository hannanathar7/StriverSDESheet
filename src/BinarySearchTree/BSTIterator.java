package BinarySearchTree;
import java.util.*;

public class BSTIterator {

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
	
	


	Stack<Node> st=new Stack<>();

    public BSTIterator(Node root) {

        pushAll(root);
        
    }
    
    public int next() {

        Node curr=st.pop();
        pushAll(curr.right);
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
            node=node.left;
        }
    }
	}
	
	
	
	
	

