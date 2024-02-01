package BinaryTree;

import java.util.*;
public class MaximumWidthOfBT {

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
	
	public static class Pair
	{
		Node n;
		long data;
		
		Pair(Node n1,long d)
		{
			n=n1;
			data=d;
		}
	}
	
	
	
	public int widthOfBinaryTree(Node root) {
		
		long max=0;
		
		if(root==null)
			return 0;
		
		Queue<Pair> q=new LinkedList<Pair>();
		
		q.add(new Pair(root,0));
		
		while(q.size()>0)
		{
			int size=q.size();
			long first=0,last=0;
			for(int i=0;i<size;i++)
			{
				long currid=q.peek().data;
				Node curr=q.remove().n;
				if(i==0)
					first=currid;
				if(i==size-1)
					last=currid;
				
				if(curr.left!=null)
					q.add(new Pair(curr.left,2*currid+1));
				
				if(curr.right!=null)
					q.add(new Pair(curr.right,2*currid+2));
			}
			max=Math.max(max,last-first+1);
		}
		
		return (int)max;
        
    }
	
	
	
}
