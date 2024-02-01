 package Array;
import java.util.*;
public class ReversePairs {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int in=0;
		in=mergesort(a,0,n-1);
		
		System.out.println(in);
		sc.close();
	}
	
	public static int mergesort(int a[],int l,int r)
	{
		int in=0;
		if(l<r)
		{
		int m=(l+r)/2;
		in+=mergesort(a,l,m);
		in+=mergesort(a,m+1,r);
		in+=merge(a,l,m,r);
		}
		
		return in;
	}
	
	public static int merge(int a[],int l,int m,int r)
	{
			int swap=0;	
			int n1 = m - l + 1;
	        int n2 = r - m;
	 
	        int L[] = new int[n1];
	        int R[] = new int[n2];
	        
	        
	        
	        for (int i = 0; i < n1; ++i)
	            L[i] = a[l + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = a[m + 1 + j];
	        
	        int i=0,j=0;
            while(i<n1 && j<n2)
            {
                if(0.5*L[i]>R[j])
                {
                    swap+=n1-i;
                    j++;
                }
                else
                {
                    i++;
                }
            }
            
            
            i=0;
            j=0;	        
	        int k = l;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                a[k] = L[i];
	                i++;
	            }
	            else {
	                a[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	 
	        
	        while (i < n1) {
	            a[k] = L[i];
	            i++;
	            k++;
	        }
	 
	    
	        while (j < n2) {
	            a[k] = R[j];
	            j++;
	            k++;
	        }
	        return swap;
	}
}
