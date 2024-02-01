package Heaps;

import java.util.*;

public class KMostFrequentElements {
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int k=sc.nextInt();
		
		sc.close();
		
		int res[]=topKFrequent(a,k);
		for(int i=0;i<res.length;i++)
		System.out.print(res[i]+" ");
		
		
	
		
	}
	
	
	
	public static int[] topKFrequent(int[] a, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>((Pair p1,Pair p2)->(p1.freq-p2.freq));
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(a[i]))
            map.put(a[i],1);

            else
            map.put(a[i],map.get(a[i])+1);
        }
        int c=0;
       for(Integer i:map.keySet())
       {
        if(c<k)
        {
            pq.add(new Pair(i,map.get(i)));
            c++;
        }
        else
        {
            if(map.get(i)>pq.peek().freq)
            {
                pq.remove();
                pq.add(new Pair(i,map.get(i)));
            }
        }
       }
       
        c=0;
       int res[]=new int[k];
       while(pq.size()>0)
       res[c++]=pq.remove().val;

       return res;
    }

    public static class Pair
    {
        int val,freq;
        Pair(int v,int f)
        {
            val=v;
            freq=f;

        }
    }
	    
	}



