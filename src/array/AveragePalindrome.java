package array;

import java.util.Arrays;

public class AveragePalindrome 
{
	public void AverageSkipLarge(int[] arr)
	{
		int sum = 0;
		int max = large(arr);
		for(int i= 0 ;i<arr.length;i++)
		{
			if(max != arr[i])
			{
				sum = sum+arr[i];
			}
		}
		int average = sum / arr.length;
		System.out.println(average);
		
	}
	public int large(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i] && max!=arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	public int pali(int num)
	{
		int sum =0;
		while(num !=0)
		{
			int rem = num%10;
			sum = sum*10+rem;
			num = num/10;
		}
		return sum;
	}
	public int[] palindrome(int[] arr)
	{
		int[] newArr = new int[arr.length-1];
		int j=0;
		int max = large(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != max)
			{
				int pali = pali(arr[i]);
				newArr[j]=pali;
				j++;
			}
		}
		return newArr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AveragePalindrome ap = new AveragePalindrome();
		int[] arr = {15,28,99,10,12,16};
//		System.out.println(ap.large(arr));
//		ap.AverageSkipLarge(arr);

//		System.out.println(ap.pali(143));
	    int[] newArr = ap.palindrome(arr);
	    System.out.println(Arrays.toString(newArr));
	}

}
