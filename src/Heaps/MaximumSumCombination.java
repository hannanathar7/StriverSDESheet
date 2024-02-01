package Heaps;

import java.util.*;

public class MaximumSumCombination {
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int b[]=new int[n];
		for(int i=0;i<n;i++)
			b[i]=sc.nextInt();
		int c=sc.nextInt();
		
		sc.close();
		
		int res[]=solve(a,b,c);
		for(int i=0;i<res.length;i++)
		System.out.print(res[i]+" ");
		
		
	
		
	}
	
	
	
	public static int[] solve(int[] a, int[] b, int c) {
        
	       Arrays.sort(a);
	       Arrays.sort(b); 
	       
	       reverse(a);
	       reverse(b);
	       
	       PriorityQueue<Triplet> pq=new PriorityQueue<>((Triplet o1,Triplet o2)->(o2.sum-o1.sum));
	       
	       Set<Pair> set=new HashSet<Pair>();
	       int res[]=new int[c];
	       
	       pq.add(new Triplet(a[0]+b[0],0,0));
	       
	       
	       for(int idx=0;idx<c;idx++)
	       {
	           Triplet t=pq.remove();
	           int sum=t.sum;
	           int i=t.i;
	           int j=t.j;
	           res[idx]=sum;
	           
	          if(!set.contains(new Pair(i,j+1)) && i<a.length && j+1<b.length)
	          {
	              pq.add(new Triplet(a[i]+b[j+1],i,j+1));
	              set.add(new Pair(i,j+1));
	          }
	          
	          if(!set.contains(new Pair(i+1,j)) && i+1<a.length && j<b.length)
	          {
	              pq.add(new Triplet(a[i+1]+b[j],i+1,j));
	              set.add(new Pair(i+1,j));
	          }
	       }
	       
	       return res;
	    }
	    
	    public static void reverse(int a[])
	    {
	        int n=a.length;
	        int i=0,j=n-1;
	        
	        while(i<j)
	        {
	            int t=a[i];
	            a[i]=a[j];
	            a[j]=t;
	            i++;
	            j--;        
	        }
	    }
	    
	    public static class Triplet
	    {
	        int sum,i,j;
	        
	        Triplet(int s,int ii,int jj)
	        {
	            sum=s;
	            i=ii;
	            j=jj;
	        }
	    }
	    
	    public static class Pair
	    {
	        int i,j;
	        
	        Pair(int ii,int jj)
	        {
	            i=ii;
	            j=jj;
	        }
	        
	        @Override
	        public boolean equals(Object obj) {
	            if (obj == this) return true;
	            if (!(obj instanceof Pair)) return false;
	            Pair pair = (Pair) obj;
	            return pair.i == i && pair.j == j;
	        }

	        @Override
	        public int hashCode() {
	            return Objects.hash(i, j);
	        }
	    }
	    
	}



