package StackAndQueue;

import java.util.*;

public class NextGreaterElement2 {

	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextLong();
		
		long res[]=new long[n];
		Stack<Long> st=new Stack<>();
		
		for(int i=2*n-1;i>=0;i--)
		{
			while((!st.isEmpty()) && st.peek()<=a[i%n])
			{
				st.pop();
			}
			
			if(i<n)
			{
			if(st.isEmpty())
				res[i]=-1;
			else
				res[i]=st.peek();
			}
			
			st.push(a[i%n]);
			
		}
		
		for(int i=0;i<n;i++)
			System.out.print(res[i]+" ");
		sc.close();
		
		
		
		
	}
}
