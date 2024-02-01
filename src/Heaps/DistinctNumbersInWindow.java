package Heaps;

import java.util.*;

public class DistinctNumbersInWindow {
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int k=sc.nextInt();
		
		sc.close();
		
		ArrayList<Integer> res=dNums(a,k);
		System.out.println(res);
		
		
	
		
	}
	
	
	
public static ArrayList<Integer> dNums(int[] a,int k) {
        
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		ArrayList<Integer> res=new ArrayList<>();
        

		for(int i=0;i<k;i++)
		{
			if(!map.containsKey(a[i]))
			map.put(a[i],1);

			else
			map.put(a[i],map.get(a[i])+1);
		}

		res.add(map.size());

		for(int i=k;i<a.length;i++)
		{
			
			if(map.get(a[i-k])==1)
			map.remove(a[i-k]);

			else
			map.put(a[i-k],map.get(a[i-k])-1);
			
			if(map.containsKey(a[i]))
			map.put(a[i],map.get(a[i])+1);

			else
			map.put(a[i],1);

			res.add(map.size());
		}
        
    
        
        return res;
	}
	    
	}



