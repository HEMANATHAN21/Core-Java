package StringPgmClass;

import java.util.Arrays;
import java.util.Scanner;

public class JumpEachCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s1 = sc.next();
		char [] arr = s1.toCharArray();
		System.out.println("Enter Rotation count : ");
		int count = sc.nextInt();
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		char ch =' ';
		
		for(int i=1;i<=count;i++)
		{
			ch = arr[1];
			for(int j=0;j<arr.length;j++)
			{
				if(ch>='a' && ch<='z')
				{
					arr[j] = ch;
					ch++;
					
				}
				else
				{
					ch='a';
					arr[j] = ch;
					ch++;
				}
			}
			System.out.println(Arrays.toString(arr));
		}

	}

}
