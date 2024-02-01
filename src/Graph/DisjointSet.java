package Graph;

import java.util.*;

public class DisjointSet {
    
	ArrayList<Integer> par=new ArrayList<>();
	ArrayList<Integer> rank=new ArrayList<>();

	
	DisjointSet(int n)
	{
		for(int i=0;i<=n;i++)
		{
			par.add(i);
			rank.add(0);
		}
	}
	
	public int findUPar(int u)
	{
		if(u==par.get(u))
			return u;
		
		int ulp=findUPar(par.get(u));
		par.set(u,ulp);
		return ulp;
	}
	
	public void UnionByRank(int u,int v)
	{
		int upu=findUPar(u);
		int upv=findUPar(v);
		
		if(upu==upv)
			return; // belong to the same component
		
		if(rank.get(upu)<rank.get(upv))
		{
			par.set(upu,upv);
		}
		else if(upv<upu)
		{
			par.set(upv, upu);
		}
		else
		{
			par.set(upu, upv);
			rank.set(upv, rank.get(upv)+1);
		}
	}
	
	
	
	
	
	
    public static void main(String args[])
    {
    	DisjointSet ds=new DisjointSet(7);
    	ds.UnionByRank(1,2);
    	ds.UnionByRank(2,3);
    	ds.UnionByRank(4,5);
    	ds.UnionByRank(6,7);
    	ds.UnionByRank(5,6);
    	
    	
    	if(ds.findUPar(3)==ds.findUPar(7))
    		System.out.println("Same Component");
    	else
    		System.out.println("Different Component");
    	
    	
    	ds.UnionByRank(3,7);
    	
    	
    	if(ds.findUPar(3)==ds.findUPar(7))
    		System.out.println("Same Component");
    	else
    		System.out.println("Different Component");
    	
    	
    }

   
}
	

