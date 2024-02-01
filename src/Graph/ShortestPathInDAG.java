
package Graph;

import java.util.*;


public class ShortestPathInDAG {
	
	
	public static int[] shortestPath(int n,int m, int[][] edges) {
	    
	    ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
	    
	    for(int i=0;i<n;i++)
	    {
	        adj.add(new ArrayList<>());
	    }
	     for(int i=0;i<m;i++)
	    {
	        adj.get(edges[i][0]).add(new Pair(edges[i][1],edges[i][2]));
	    }
	    
	    int dis[]=new int[n];
	    Arrays.fill(dis,Integer.MAX_VALUE);
	    
	    PriorityQueue<Pair> pq=new PriorityQueue<>((Pair o1,Pair o2)->(o1.wt-o2.wt));
	    pq.add(new Pair(0,0));
	    dis[0]=0;
	    
	    while(pq.size()>0)
	    {
	        Pair p=pq.remove();
	        int v=p.v;
	        int wt=p.wt;
	        
	      
	        for(Pair a:adj.get(v))
	        {
	            int d=a.wt;
	            int i=a.v;
	            
	            if(wt+d<dis[i])
	            {
	                dis[i]=wt+d;
	                pq.add(new Pair(i,dis[i]));
	            }
	        }
	       
	        
	    }
	    
	    for(int i=0;i<n;i++)
	    {
	        if(dis[i]==Integer.MAX_VALUE)
	        dis[i]=-1;
	    }
	    
	    return dis;
	    
	
	
	}
	
	public static class Pair
	{
	    int v,wt;
	    
	    Pair(int vi,int w)
	    {
	    	v=vi;
	        wt=w;
	        
	    }
	}
		 		
		 		
	 
		 		
		 	
	 
	public static void main(String args[])
	 {
		int n=6,m=7;
		int edges[][]= {{0,1,2},{0,4,1},{4,5,4},{4,2,2},{1,2,3},{2,3,6},{5,3,1}};
		
		
		int dis[]=shortestPath(n,m,edges);
		
		for(int i=0;i<dis.length;i++)
			System.out.println(dis[i]+" ");
		
	 }
	 
	 
}
	
	

