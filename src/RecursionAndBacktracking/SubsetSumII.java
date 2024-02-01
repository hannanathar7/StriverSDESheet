package RecursionAndBacktracking;
import java.util.*;

public class SubsetSumII {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		sc.close();
		
		 Arrays.sort(a);
		    List<List<Integer>> ansList=new ArrayList<>();
		    List<Integer> list=new ArrayList<>();
		    findSubsets(0,a,list,ansList);
		    
			System.out.println(ansList);
	}
	
	
	    public static void findSubsets(int ind,int nums[],List<Integer> ds,List<List<Integer>> ansList)
	    {
	        ansList.add(new ArrayList<>(ds));
	        for(int i=ind;i<nums.length;i++)
	        {
	            if(i>ind && nums[i]==nums[i-1])
	            continue;

	            ds.add(nums[i]);
	            findSubsets(i+1,nums,ds,ansList);
	            ds.remove(ds.size() -1);
	        }
	    }

}
