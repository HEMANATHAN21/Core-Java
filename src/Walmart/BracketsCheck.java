package Walmart;

import java.util.Arrays;

public class BracketsCheck {

	public static void main(String[] args) 
	{
//		int[] arr = {'{','}','[',']','(',')'};
//		System.out.println(Arrays.toString(arr));
		
		String str = "[{}{}]";
		char[] arr = str.toCharArray();
		int count = 0;
		if(arr.length %2 == 0)
		{
			for(int i=0;i<=arr.length/2;i++)
			{
				if(arr[i] == '[' || arr[i] == '{' || arr[i] == '(')
					{
						if(arr[i] - arr[i+1] == -2)
						{
							i++;
							count++;
						}
						else if(arr[i] - arr[i+1] == -1)
						{
							i++;
							count++;
						}
						else if(arr[i] - arr[arr.length-i-1] == -2)
						{
							count++;
						}
						else if(arr[i] - arr[arr.length-i-1] == -1)
						{
							count++;
						}
						else
						{
							System.out.println("Invalid Brackets");
							break;
						}
					}
					else
					{
						System.out.println("Invalid Brackets");
						break;
					}
				}
		}
		else
		{
			System.out.println("Invalid Brackets");
		}
		if(count == arr.length/2)
			System.out.println("Valid Brackets");
	}

}
