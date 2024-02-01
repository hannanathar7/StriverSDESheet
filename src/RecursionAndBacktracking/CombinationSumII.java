package RecursionAndBacktracking;
import java.util.*;

public class CombinationSumII {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int target=sc.nextInt();
		
		sc.close();
		
		 Arrays.sort(a);
		    List<List<Integer>> ansList=new ArrayList<>();
		    List<Integer> list=new ArrayList<>();
		    findCombinations(0,a,target,list,ansList);
		   
		        			System.out.println(ansList);
	}
	
	

	     public static void findCombinations(int ind,int a[],int target,List<Integer> ds,List<List<Integer>> ansList)
	    {
	       if(target==0)
	       {
	           ansList.add(new ArrayList<>(ds));
	           return;
	       }

	       for(int i=ind;i<a.length;i++)
	       {
	           if(i>ind && a[i]==a[i-1])
	           continue;

	           if(a[i]>target)
	           break;

	           ds.add(a[i]);
	           findCombinations(i+1,a,target-a[i],ds,ansList);
	           ds.remove(ds.size()-1);
	       }
	    }

}
