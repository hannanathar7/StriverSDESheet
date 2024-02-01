package Array;
import java.util.*;
public class SubarrayWithMaximumSum {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		int sum=0,max=Integer.MIN_VALUE;
		int start=-1,starti=-1,endi=-1;
        for(int i=0;i<a.length;i++)
        {
        	if(sum==0)
        	start=i;
            sum=sum+a[i];
            if(sum>max)
            {
            max=sum;
            starti=start;
            endi=i;
            }
            if(sum<0)
            sum=0;
        }
			for(int i=starti;i<=endi;i++)
			{
				System.out.print(a[i]+" ");
			}
		
		
		
		
	}
	

	
}
