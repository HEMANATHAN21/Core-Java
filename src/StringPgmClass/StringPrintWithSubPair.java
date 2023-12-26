package StringPgmClass;

import java.util.Scanner;

public class StringPrintWithSubPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i;j<s1.length();j++)
			{
				for(int k=i;k<=j;k++)
				{
					char ch = s1.charAt(k);
					System.out.print(ch);
				}
				System.out.println();
			}
		}

	}

}
