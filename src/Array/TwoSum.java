package Array;
import java.util.*;
public class TwoSum {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int k=sc.nextInt();
		 int res[]=twoSum(a,k);
		sc.close();
		
		for(int i=0;i<2;i++)
			System.out.print(res[i]+" ");
		
		
		
		
		
	}
	
	 public static int[] twoSum(int[] a, int k) {

	        int res[]=new int[2];
	        int n=a.length;
	        Arrays.fill(res,-1);

	        Pair p[]=new Pair[n];

	        for(int i=0;i<n;i++)
	        {
	            p[i]=new Pair(a[i],i);
	        }

	        Arrays.sort(p, new Comparator<Pair>(){

	            public int compare(Pair o1,Pair o2)
	            {
	                return o1.val-o2.val;
	            }
	        });

	        int i=0,j=n-1;
	        while(i<j)
	        {
	            int s=p[i].val+p[j].val;
	            if(s==k)
	            {
	                res[0]=p[i].idx;
	                res[1]=p[j].idx;
	                break;
	            }
	            else if(s<k)
	            i++;
	            else
	            j--;
	        }
	        return res;
	        
	    }
	}


class Pair
{
    int val,idx;

    Pair(int v,int i)
    {
        val=v;
        idx=i;
    }
}
