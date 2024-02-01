package String;

import java.util.*;


public class ReverseWordsInString {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		sc.close();
		
		System.out.println(reverseWords(S));
		
	}
	
	
	public static String reverseWords(String s) {

	     StringBuilder sb=new StringBuilder();

	     int i=s.length()-1;

	     while(i>=0)
	    {
	        while(i>=0 && s.charAt(i)==' ')
	        i--;

	        int j=i;

	        while(i>=0 && s.charAt(i)!=' ')
	        i--;

	        sb.append(s.substring(i+1,j+1));
	        sb.append(" ");
	    }
	    String res=sb.toString().trim();

	    return res;
	    }

}
