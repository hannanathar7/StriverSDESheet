package Array;
import java.util.*;
public class GridUniquePath {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		sc.close();
		
		 int N =(m-1)+(n-1); //totalStepsNeeded
			int r=m-1; //(n-1)
			
			double ans=1.0;
			
			for(int i=1;i<=r;i++)
			{
				ans=ans*(N-r+i);
				ans=ans/i;

			}
			
			

	  
		
		System.out.println((int)ans);
		
		
	}
	

	
}
