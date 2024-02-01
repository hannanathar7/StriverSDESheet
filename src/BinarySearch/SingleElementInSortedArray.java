package BinarySearch;
import java.util.*;
public class SingleElementInSortedArray {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		sc.close();
		
	
			System.out.println(singleNonDuplicate(a));
			
	}
	
	public static int singleNonDuplicate(int[] a) {

        int low=0,high=a.length-2;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(a[mid]==a[mid^1])
            low=mid+1;

            else
            high=mid-1;
        }
        return a[low];
        
    }
}
