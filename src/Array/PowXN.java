package Array;
import java.util.*;
public class PowXN {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double x=sc.nextDouble();
		int n=sc.nextInt();
		sc.close();
		
		double ans=1.0;
		long n1=n;
		
		if(n1<0)
			n1=n1*-1;
		
		while(n1>0)
		{
			if(n1%2==0)
			{
				x=x*x;
				n1=n1/2;
			}
			else
			{
				ans=ans*x;
				n1=n1-1;
			}
		}
		
		if(n<0)
		ans=(double)1.0/(double)ans;
		
		System.out.println(ans);
		
		
		
		
	}
	

	
}
