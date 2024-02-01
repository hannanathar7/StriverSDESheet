
package Graph;

import java.util.*;


public class ShortestPathInWeightedUndirectedGraph {
	
	//we have to print the path
	
	public static ArrayList<Integer> shortestPath(int n,int m, int[][] edges) {
	    
	    ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
	    ArrayList<Integer> path=new ArrayList<>();
	    
	    for(int i=0;i<n+1;i++)
	    {
	        adj.add(new ArrayList<>());
	    }
	    
	     for(int i=0;i<m;i++)
	    {
	        adj.get(edges[i][0]).add(new Pair(edges[i][1],edges[i][2]));
	        adj.get(edges[i][1]).add(new Pair(edges[i][0],edges[i][2]));
	    }
	    
	    int dis[]=new int[n+1];
	    Arrays.fill(dis,Integer.MAX_VALUE);
	    
	    int par[]=new int[n+1];
	    for(int i=0;i<n+1;i++)
	    	par[i]=i;
	    
	    
	    PriorityQueue<Pair> pq=new PriorityQueue<>((Pair o1,Pair o2)->(o1.wt-o2.wt));
	    pq.add(new Pair(1,0));
	    dis[1]=0;
	    
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
	                par[i]=v;
	                pq.add(new Pair(i,dis[i]));
	            }
	        }
	    }

	    if(dis[n]==Integer.MAX_VALUE)
	    {
	    path.add(-1);
	    return path;
	    }
	    
	  
	    int i=n;
	    path.add(n);
	    
	    while(par[i]!=1)
	    {
	    	path.add(par[i]);
	    	i=par[i];
	    }
	    
	    path.add(1);
	    Collections.reverse(path);
	    return path;
	    
	
	}
	
	
		 		
	 
		 		
		 	
	 
	public static void main(String args[])
	 {
		int n=5,m=6;
		int edges[][]= {{1,2,2},{2,5,5},{2,3,4},{1,4,1},{4,3,3},{3,5,1}};
		
		
		ArrayList<Integer> path=shortestPath(n,m,edges);
		
		
			System.out.println(path);
		
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
		 	
	 
	 
}
	
	

