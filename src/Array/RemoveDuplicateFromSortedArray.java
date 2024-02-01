package Array;
import java.util.*;
public class RemoveDuplicateFromSortedArray {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		int len=removeDuplicates(a);
		
		sc.close();
		
		for(int i=0;i<len;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		
		
		
		
		
	}
	
	 public static int removeDuplicates(int[] a) {

         int n=a.length;
         int i=0,j=1;
         while(j<n)
         {
             if(a[i]!=a[j])
             {
                 i++;
                 a[i]=a[j];
                 j++;
             }
             else
             {
                 j++;
             }
         }

         return i+1;
     
     
 }
	
}
