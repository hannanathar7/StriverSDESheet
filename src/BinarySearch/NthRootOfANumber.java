package BinarySearch;

import java.util.Scanner;

public class NthRootOfANumber {
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		sc.close();
		
		System.out.println(NthRoot(n,m));
	}
	
	 public static int NthRoot(int n, int m) {
	      
	      int low=1;int high=m;

	      while(low<=high)
	      {
	          int mid=(low+high)/2;

	          int res=pow(mid,n,m);
	          if(res==1)
	          return mid;

	          else if(res==0)
	          low=mid+1;

	          else
	          high=mid-1;
	      }
	      return -1;
	    }

	    public static int pow(int mid,int n,int m)
	    {
	        long f=1;
	        for(int i=1;i<=n;i++)
	        {
	            f=f*mid;
	            if(f>m)
	            return 2;
	        }
	        if(f==m)
	        return 1;

	        else return 0;
	    }

}
