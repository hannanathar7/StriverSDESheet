package BinarySearchTree;

public class PopulateNextRightPointers {

	public static class Node
	{
		int data;
		Node left;
		Node right;
		Node next;
		
		Node(int d)
		{
			data=d;
			left=null;
			right=null;
			next=null;
		}
	}
	
	public Node connect(Node root) {

        if(root==null)
        return root;

        Node curr=root;

        while(curr.left!=null)
        {
            Node temp=curr;

            while(curr!=null)
            {
            curr.left.next=curr.right;
            if(curr.next!=null)
            curr.right.next=curr.next.left;
            curr=curr.next;
            }
            curr=temp.left;
        }
        
        return root;
    }
	
	
	
	
	
	
	
}
