package Array;
import java.util.*;
public class NoOfSubarraysWithGivenXor {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		
		System.out.println(subarraysWithXorK(a,b));
		
		
		
		
	}
	
public static int subarraysWithXorK(int []a, int b) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=a.length;
        int xor=0,c=0;
        map.put(0,1);
        for(int i=0;i<n;i++)
        {
         xor=xor^a[i];

         if(map.containsKey(xor^b))
         {
             c+=map.get(xor^b);
             
         }
         if(map.containsKey(xor))
         {
             map.put(xor,map.get(xor)+1);
         }
         else
         {
             map.put(xor,1);
         }
        } 

        return c; 
    }
	

	
}
