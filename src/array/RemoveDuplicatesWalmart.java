package array;

import java.util.Arrays;

public class RemoveDuplicatesWalmart {

	public static void main(String[] args) 
	{
		int[] arr = {1,1,2,3,2,3,4,5,6,9,8};

		for(int l=0;l<arr.length;l++)
		{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						for(int k=j;k<arr.length-1;k++)
						{
							arr[k]=arr[k+1];
							
						}
						arr[arr.length-1]=0;
					}
				}
			}
			
		}
		

	}
		System.out.println(Arrays.toString(arr));
		int duplicateCount =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				duplicateCount++;
			}
		}
		
		int[] newArr = new int[arr.length-duplicateCount];
		
		for(int i=0;i<arr.length-duplicateCount;i++)
		{
			newArr[i] = arr[i];
		}
		System.out.println(Arrays.toString(newArr));
		
	}
}
