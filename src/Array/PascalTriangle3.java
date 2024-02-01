package Array;
import java.util.*;
public class PascalTriangle3 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		sc.close();
		
		List<List<Integer>> ans=new ArrayList<>();
		
		for(int i=1;i<=n;i++)
		{
			ans.add(pascal(i));
		}
		
		System.out.println(ans);
		
		
	}
	
	public static List<Integer> pascal(int n)
	{
	int ans=1;
	List<Integer> list=new ArrayList<>();
	list.add(1);
	for(int i=1;i<n;i++)
	{
		ans=ans*(n-i);
		ans=ans/i;
		list.add(ans);
	}
	return list;
	}
}
