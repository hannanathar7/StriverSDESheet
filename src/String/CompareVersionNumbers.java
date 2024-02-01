package String;

import java.util.*;


public class CompareVersionNumbers {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		sc.close();
		
		System.out.println(compareVersion(s,t));
		
	}
	
	
	public static int compareVersion(String version1, String version2) {

        int l1=version1.length();
        int l2=version2.length();

        int i=0,j=0;

        while(i<l1 || j<l2)
        {
            int ans1=0;
            int ans2=0;

            while(i<l1 && version1.charAt(i)!='.')
            {
            ans1=ans1*10+version1.charAt(i)-'0';
            i++;
            }

            while(j<l2 && version2.charAt(j)!='.')
            {
                ans2=ans2*10+version2.charAt(j)-'0';
                j++;
            }
            

            if(ans1>ans2)
            return 1;

            else if (ans2>ans1)
            return -1;

            else
            {
                i++;
                j++;
            }

        }

        return 0;
        
    }
}
