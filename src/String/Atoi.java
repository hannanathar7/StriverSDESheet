package String;

import java.util.*;


public class Atoi {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		sc.close();
		
		System.out.println(myAtoi(S));
		
	}
	
	
	public static int myAtoi(String s) {

        if(s.length()==0)
        return 0;
        
        int l=s.length();
        long ans=0;
        int sign=1;
        int i=0;
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;

        s=s.trim();

        if(s.charAt(0)=='-')
        sign=-1;

        if(s.charAt(0)=='+' || s.charAt(0)=='-')
        i=1;

        while(i<l)
        {
            if(s.charAt(i)==' ' || !Character.isDigit(s.charAt(i)))
            break;
            
            ans=ans*10+(s.charAt(i)-'0');
            i++;

            if(sign==-1 && -1*ans<min)
            return min;

            if(sign==+1 && 1*ans>max)
            return max;
            
           
        }

       return (int)(ans*sign);
        
    }

}
