package StringPgmClass;

import java.util.Scanner;

public class PermutationOfString 
{
	private static void permute(String s1, String s2)
	{
		if(s1.length() ==0)
		{
			System.out.println("  "+s2);
			return;
		}
		
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			String res = s1.substring(0, i) + s1.substring(i+1);
			System.out.println(res+" , "+ch+s2+" , "+i);
			permute(res,ch+s2);
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = "abc";
		String s2 = "";
		permute(s1,s2);
		//System.out.println(s1.substring(1) );
		
		
	}

}
