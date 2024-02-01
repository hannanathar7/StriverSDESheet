package Array;
import java.util.*;
public class PascalTriangle2 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		sc.close();
		
		long ans=1;
		System.out.print("1"+" ");
		for(int i=1;i<n;i++)
		{
			ans=ans*(n-i);
			ans=ans/i;
			System.out.print(ans);
		}
		
		
		
	}
}
