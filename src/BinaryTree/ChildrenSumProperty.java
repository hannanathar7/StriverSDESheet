package BinaryTree;

public class ChildrenSumProperty {

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
	
	public static void changeTree(Node root)
	{
		if(root==null)
			return;
		
		int tot=0;
		
		if(root.left!=null)
			tot+=root.left.data;
		
		if(root.right!=null)
			tot+=root.right.data;
		
		if(tot>root.data)
			root.data=tot;
		
		else
		{
			if(root.left!=null)
				root.left.data=root.data;
			
			if(root.right!=null)
				root.right.data=root.data;
		}
		
		changeTree(root.left);
		changeTree(root.right);
		
		int total=0;
		if(root.left!=null)
			total+=root.left.data;
		if(root.right!=null)
			total+=root.right.data;
		
		if(root.left!=null || root.right!=null)
		root.data=total;

		
		
		
		
	}
	
	
	
	
}
