package Array;
import java.util.*;
public class SetMatrixZeroes {

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
		
		int col=1;
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j]==0)
				{
					a[i][0]=0;
					
					if(j!=0)
						a[0][j]=0;
					
					else
					col=0;
					
				}
			}
		}
		
		for(int i=1;i<m;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(a[i][0]==0 || a[0][j]==0)
					a[i][j]=0;
			}
		}
		
		if(a[0][0]==0)
		{
			for(int j=0;j<n;j++)
			a[0][j]=0;
		}
		
		if(col==0)
		{
			for(int i=0;i<m;i++)
				a[i][0]=0;
		}
		

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}
}
