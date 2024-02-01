package BinarySearchTree;

public class ConvertSortedArraytoBST {

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
	
	 public Node sortedArrayToBST(int[] a) {

	
	Node root=solve(a,0,a.length-1);
    return root;
	 }

public Node solve(int a[],int start,int end)
{
   
   if(start>end)
   return null;
   
   else
   {
    int mid=(start+end)/2;

    Node root=new Node(a[mid]);

    root.left=solve(a,start,mid-1);
    root.right=solve(a,mid+1,end);

    return root;
    }
}
	
	
	
	
	
	
}
