package array;

import java.util.Arrays;

public class SplitAndSortAndMergeArray {
	
	static int[] SortedArray(int arr[])
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,7,6,5,4,3,2,1};
		int split=arr.length / 2;
		int temp1[]=new int[split];
		int temp2[]=new int[split];
		
		System.out.println("Given Array Is : "+Arrays.toString(arr));
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(i<split)
			{
				temp1[i]=arr[i];
			}
			else
			{
				int j=i-split;
				temp2[j]=arr[i];
			}
		}
		
		System.out.println("Splited array 1 : "+Arrays.toString(temp1));
		System.out.println("Splited array 2 : "+Arrays.toString(temp2));
		
		temp1=SortedArray(temp1);
		System.out.println("Sorted Split array 1 : "+Arrays.toString(temp1));
		temp2=SortedArray(temp2);
		System.out.println("Sorted Split array 2 : "+Arrays.toString(temp2));
		
		for(int i=0;i<arr.length;i++)
		{
			if(i<split)
			{
				arr[i]=temp1[i];
			}
			else
			{
				int j=0;
				j=i-split;
				arr[i]=temp2[j];
			}
		}
		System.out.println("Merged Array Is : "+Arrays.toString(arr));
		arr=SortedArray(arr);
//		System.out.println("Sorted Array Is : "+Arrays.toString(arr));
		

}
}