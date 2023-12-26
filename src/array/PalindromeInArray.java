package array;

import java.util.Arrays;

public class PalindromeInArray {
	
	static void Palindrome(int arr[])
	{
		int count=0;
		int sum=0;
		int temparr[] = new int[arr.length];
		int inc=1;
		int tempmax=0;
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			int temp=arr[i];
			int palin=0;
			int remainder;
			
			
			while(num>0)
			{
				remainder=num%10;
			    palin=palin*10+remainder;
			    num=num/10;
			}
			
			if(palin==temp)
			{
				System.out.println(arr[i]+" Is Palindrome");
				count++;
				sum=sum+palin;
				temparr[inc]=arr[i];
				inc++;
			}
		}
		System.out.println(Arrays.toString(temparr));
		for(int l=0;l<temparr.length;l++)
		{
			if(temparr[l]>tempmax)
			{
				tempmax=temparr[l];
			}
		}
		System.out.println("Count Is : "+count);
		System.out.println("Sum Is : "+sum);
		System.out.println("Average Is : "+sum/count);
		System.out.println("large palindrome Is : "+tempmax);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {121,1221,143,123,1};
		Palindrome(arr);

	}

}
