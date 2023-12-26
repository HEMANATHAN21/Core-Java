package StringPgmClass;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagramOrNot 
{
	
	static char[] sort(char[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			char temp;
			for(int j=i+1;j<arr.length;j++)
			{
				if((int)arr[i] > (int)arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1 : ");
		String s1 = sc.next();
		System.out.println("Enter string 2 : ");
		String s2 = sc.next();
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		System.out.println(sort(arr1));
		System.out.println(sort(arr2));
		
		if(arr1.length == arr2.length && (Arrays.equals(sort(arr1),sort(arr2))))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}

	}

}
