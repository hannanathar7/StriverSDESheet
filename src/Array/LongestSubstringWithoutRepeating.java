package Array;
import java.util.*;
public class LongestSubstringWithoutRepeating {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		
		System.out.println(lengthOfLongestSubstring(s));
		
		
		
	}
	
	 public static int lengthOfLongestSubstring(String s) {

	        int l=s.length();
	        HashMap<Character,Integer> map=new HashMap<>();
	        int i=0,j=0,max=0;
	        while(i<l && j<l)
	        {
	            char ch=s.charAt(j);
	            if(!map.containsKey(ch))
	            {
	                map.put(ch,j);
	                max=Math.max(max,j-i+1);

	            }
	            else
	            {
	                i=Math.max(map.get(ch)+1,i);
	                max=Math.max(max,j-i+1);
	                map.put(ch,j);
	                
	            }
	            j++;
	        }
	        return max;
	        
	    }
	

	
}
