package Walmart;

import java.util.Arrays;

public class SortingAlgorithms 
{
	public int[] bubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length - i - 1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public int[] selectionSort(int[] arr)
	{
		int temp = 0;
		int minIndex = 0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[minIndex] > arr[j])
					minIndex = j;
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}
		return arr;
	}
	
	public int[] insertionSort(int[] arr)
	{
		int j = 0;
		for(int i=1;i<arr.length;i++)
		{
			int key = arr[i];
			j = i - 1;
			while(j>=0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			
		}
		return arr;
	}
	public int[] quickSort(int[] arr,int low,int high)
	{
		if(low<high)
		{
			
		}
		return arr;
	}
	
	public int quickSortPivot(int[] arr,int low,int high)
	{
		int pivot = high;
		int i = low +1;
		return pivot;
	}

	public static void main(String[] args) 
	{
		SortingAlgorithms s = new SortingAlgorithms();
		int[] arr = {2,4,1,4,5};
//		System.out.println(arr[-1]);
		System.out.println(Arrays.toString(s.insertionSort(arr)));

	}

}
