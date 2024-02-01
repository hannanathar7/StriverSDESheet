package Array;
import java.util.*;
public class MaximumConsecutiveOnesIn1DArray {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		System.out.println(findMaxConsecutiveOnes(a));
		
		sc.close();
		
		
		
		
		
		
		
		
	}
	
	 public static int findMaxConsecutiveOnes(int[] a) {

	        int c=0,max=0;
	        int n=a.length;
	        for(int i=0;i<n;i++)
	        {
	            if(a[i]==0)
	            {
	                c=0;
	            }
	            else
	            {
	                c++;
	                max=Math.max(c,max);
	            }
	        }

	        return max;
	        
	    }
	
}
