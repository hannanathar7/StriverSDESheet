package Array;
import java.util.*;
public class LargestSubarrayWith0Sum {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		
		int ans=maxLen(a,n);
		
		System.out.println(ans);
		
		
		
		
		
	}
	
	static int maxLen(int a[], int n)
    {
       HashMap<Integer,Integer> map=new HashMap<>();
       
       int sum=0,max=0;
       for(int i=0;i<n;i++)
       {
           sum=sum+a[i];
           if(sum==0)
           {
               max=i+1;
           }
           else
           {
               if(!map.containsKey(sum))
               {
                   map.put(sum,i);
               }
               else
               {
                   int idx=map.get(sum);
                   max=Math.max(max,i-idx);
               }
           }
       }
       
       return max;
    }
	

	
}
