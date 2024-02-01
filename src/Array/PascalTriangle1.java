package Array;
import java.util.*;
public class PascalTriangle1 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int r=sc.nextInt();
		sc.close();
		
		n=n-1;
		r=r-1;
		long ans=1;
		for(int i=0;i<r;i++)
		{
			ans=ans*(n-i);
			ans=ans/(i+1);
		}
		 System.out.println(ans);
		
		
	}
}
