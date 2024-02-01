package StackAndQueue;

import java.util.*;

public class SlidingWindowMaximum {

	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		int k=sc.nextInt();
		
		int res[]=maxSlidingWindow(a,k);
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+" ");
		sc.close();
		
		
		
		
	}
	
	 public static int[] maxSlidingWindow(int[] a, int k) {
	        
	     int n=a.length;
	        int res[]=new int[n-k+1];
	        int resi=0;

	        Deque<Integer> dq=new ArrayDeque<>();

	        for(int i=0;i<n;i++)
	        {
	            while(dq.size()>0 && dq.peek()<=(i-k))
	            dq.poll();


	            while(dq.size()>0 && a[dq.peekLast()]<=a[i])
	            dq.pollLast();

	            dq.offer(i);

	            if(i>=k-1)
	            {
	            res[resi]=a[dq.peek()];
	            resi++;
	            }

	        
	        }


	        return res;
	    }
}
