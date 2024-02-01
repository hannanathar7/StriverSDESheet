package Array;
import java.util.*;
public class FourSum {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int k=sc.nextInt();
		List<List<Integer>> res=fourSum(a,k);
		sc.close();
		
	
			System.out.println(res);
		
		
		
		
		
	}
	
	 public static List<List<Integer>> fourSum(int[] a, int target) {
	        
	        List<List<Integer>> res=new ArrayList<>();
	        Arrays.sort(a);
	        long sum=0;
	        int n=a.length;
	        for(int i=0;i<n;i++)
	        {
	            if(i>0 && a[i]==a[i-1])
	            continue;

	            for(int j=i+1;j<n;j++)
	            {
	                if(j>i+1 && a[j]==a[j-1])
	                continue;
	                
	                int k=j+1;
	                int l=n-1;

	                while(k<l)
	                {
	                    sum=a[i];
	                    sum+=a[j];
	                    sum+=a[k];
	                    sum+=a[l];
	                    if(sum==target)
	                    {
	                        List<Integer> list=new ArrayList<>();
	                        list.add(a[i]);
	                        list.add(a[j]);
	                        list.add(a[k]);
	                        list.add(a[l]);
	                        res.add(list);
	                        k++;
	                        l--; 
	                        while(k<l && a[k]==a[k-1])
	                        k++;
	                        while(k<l && a[l]==a[l+1])
	                        l--;
	                    }
	                    else if(target>sum)
	                    k++;
	                    else
	                    l--;
	                }
	            }
	        }
	        return res;
	    }
}
