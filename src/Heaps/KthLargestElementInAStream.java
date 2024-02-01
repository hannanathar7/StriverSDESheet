package Heaps;

import java.util.*;


	
	
	
	
	class KthLargest {

	    PriorityQueue<Integer> pq;
	    int size;

	    public KthLargest(int k, int[] a) {
	        pq=new PriorityQueue<>();
	        size=k;

	        for(int i=0;i<a.length;i++)
	        pq.add(a[i]);

	        while(pq.size()>k)
	        pq.remove();
	    }
	    
	    public int add(int val) {
	        
	       pq.add(val);
	       if(pq.size()>size)
	       pq.remove();
	        

	        return pq.peek();
	    }
	    
	    
	    
	    public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			
			
			sc.close();

		}
		
	}



