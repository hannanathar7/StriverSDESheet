package BinarySearch;
import java.util.*;
public class MatrixMedian {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		sc.close();
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println(findMedian(a,m,n));
	
		
	}
	
	 public static int findMedian(int a[][], int m, int n) {

	        int low=0,high=1000000009;
	        

	        while(low<=high)
	        {
	            int mid=(low+high)/2;
	            int c=0;

	            for(int i=0;i<m;i++)
	            c+=NumbersLessThanEqualToMid(a[i],n,mid);

	            if(c<=(n*m)/2)
	            low=mid+1;

	            else 
	            high=mid-1;
	        }
	        return low;   
	    }

	    public static int NumbersLessThanEqualToMid(int a[],int n,int m)
	    {
	        
	        int low=0,high=n-1;

	        while(low<=high)
	        {
	            int mid=(low+high)/2;
	            if(a[mid]<=m)
	            low=mid+1;

	            else
	            high=mid-1;

	        }
	        return low;

	    }
}
