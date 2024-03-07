package array;

import java.util.Arrays;

public class WalmartTaskArr 
{
	public int[] splitLast(int[] arr)
	{
		int[] newArr = new int[arr.length-1];
		int j = 0;
		int length = arr.length/2;
		for(int i=0;i<arr.length/2;i++)
		{
			newArr[j] = arr[length +i +1];
			j++;
			newArr[j] = arr[length -i -1];
			j++;	
		}
		
		return newArr;
	}
	
	public int[] lastFirst(int[] arr)
	{
		int[] newArr = new int[arr.length-1];
		int j=0;
		int length = arr.length-1;
		for(int i=0;i<arr.length/2;i++)
		{
			newArr[j] = arr[length - i];
			j++;
			newArr[j] = arr[i];
			j++;
		}
		return newArr;
	}
	
	public int[] lastFirst2(int[] arr)
	{
		int[] newArr = new int[arr.length-1];
		int length = arr.length-1;
		for(int i=0;i<arr.length/2;i++)
		{
			newArr[i] = arr[length - i];
			newArr[arr.length/2 +i] = arr[i];
		}
		
		return newArr;
	}
	
	public int[] task4(int[] arr)
	{
		int[] newArr = new int[arr.length-1];
		for(int i=0;i<arr.length/2 ;i++)
		{
			newArr[i] = arr[i];
		}
		
		int length = arr.length-1;
		int j=0;
		
		for(int i=arr.length/2;i<arr.length-1;i++)
		{
			newArr[i] = arr[length -j];
			j++;
		}
		return newArr;
	}

	public static void main(String[] args) 
	{
//		System.out.println(7/2);
		WalmartTaskArr w = new WalmartTaskArr();
		int[] arr = {1,2,3,4,5,6,7};
		
		int[] newArr = w.lastFirst(arr);
		System.out.println(Arrays.toString(newArr));

	}

}
