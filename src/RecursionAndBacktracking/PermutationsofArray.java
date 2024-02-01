package RecursionAndBacktracking;
import java.util.*;

public class PermutationsofArray {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		sc.close();
		
		List<List<Integer>> res=new ArrayList<>();
 
        int i=0;
        permutations(a,n,i,res);
    
		    
			System.out.println(res);
	}
	
	
	 public static void permutations(int a[],int n,int idx,List<List<Integer>> res)
	    {
	       if(idx==n)
	       {
	           List<Integer> list=new ArrayList<>();
	           for(int i=0;i<n;i++)
	           list.add(a[i]);

	           res.add(new ArrayList<>(list));
	           return;
	       }
	        for(int i=idx;i<n;i++)
	        {
	            swap(i,idx,a);
	            permutations(a,n,idx+1,res);
	            swap(i,idx,a);
	        }
	    }

	    public static void swap(int i,int j,int a[])
	    {
	        int t=a[i];
	        a[i]=a[j];
	        a[j]=t;

	    }
}
