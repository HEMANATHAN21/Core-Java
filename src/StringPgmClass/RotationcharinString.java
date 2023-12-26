package StringPgmClass;

import java.util.Scanner;

public class RotationcharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s1 = sc.next();
		System.out.println("Enter Rotation count : ");
		int count = sc.nextInt();
		String Result = "";
		
		for(int i=1;i<=count;i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				char ch = s1.charAt(j);
				int ascinum = (int)ch + 1;
				ch = (char)ascinum;
			
				if(ch > 'z')
				{
					int num = (int) ch - 26;
					ch = (char) num;
					Result = Result + ch;
				}
				else
				{
					Result = Result + ch;
				}
			}
			System.out.println(Result);
			s1=Result;
			Result ="";
		}
		
	}

}
