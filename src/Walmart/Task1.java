package Walmart;

import java.util.Arrays;

public class Task1 
{
	public static int[] sort(int[] arr)
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = {21,4,15,17,11};
		int[] newArr = Task1.sort(arr);
		int x=11;
		int k = 1;
		int sum=0;
		for(int i=0;i<k;i++)
		{
			if(newArr[i] <=x)
			{
				sum=sum+newArr[i];
			}
		}
		System.out.println(sum);
	}

}
