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
			int pi = quickSortPivot(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
			
		}
		return arr;
	}
	
	public static int quickSortPivot(int[] arr,int low,int high)
	{
		int pivot = arr[high];
		int i = low - 1;
		for(int j = low;j<high;j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
	
	public int[] mergeSort(int[] arr, int low, int high)
	{
		if(low < high)
		{
			int mid = (low + high)/2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			
			merge(arr, low, mid, high);
		}
		return arr;
	}
	
	public static int[] merge(int[] arr,int low, int mid,int high)
	{
		int a1 = mid - low + 1;
		int a2 = high - mid;
		int[] lowArr = new int[a1];
		int[] highArr = new int[a2];
		
		for(int x=0;x<a1;x++)
		{
			lowArr[x] = arr[low + x];
		}
		for(int y=0;y<a2;y++)
		{
			highArr[y] = arr[mid +1 +y];
		}
		
		int i = 0;
		int j = 0;
		int k = low;
		
		while(i<a1 && j<a2)
		{
			if(lowArr[i] <= highArr[j])
			{
				arr[k] = lowArr[i];
				i++;
			}
			else
			{
				arr[k] = highArr[j];
				j++;
			}
			k++;
		}
		while(i<a1)
		{
			arr[k] = lowArr[i];
			i++;
			k++;
		}
		while(j<a2)
		{
			arr[k] = highArr[j];
			j++;
			k++;
		}
		return arr;
	}

	public static void main(String[] args) 
	{
		SortingAlgorithms s = new SortingAlgorithms();
		int[] arr = {2,4,1,4,5};
//		System.out.println(arr[-1]);
		System.out.println(Arrays.toString(s.mergeSort(arr,0,arr.length-1)));

	}

}
