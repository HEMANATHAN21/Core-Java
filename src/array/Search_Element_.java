package array;

import java.util.Arrays;

public class Search_Element_ {
	
	public static int checkatfirst(int [] arr,int searchelement)
	{
		int position=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==searchelement)
			{
				position=i;
				//break;
			}
		}
		return position;
	}
	
	public static int checkatlast(int [] arr,int searchelement)
	{
		int position=-1;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]==searchelement)
			{
				position=i;
				
				break;
			}
		}
		return position;
	}
	
	public static int checkbyoccurence(int [] arr,int searchelement,int occurence)
	{
		int position=-1;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==searchelement)
			{
				position=i;
				count++;
			}
			if(occurence==count)
			{
				break;
			}
		}
		return position;
	}
	
	static void deleteposition(int [] arr,int position)
	{
		for(int i=position;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=0;
		System.out.println(Arrays.toString(arr));
	}
	
	private static void deleteelement(int [] arr,int element)
	{
		int position =checkatfirst(arr,element);
		if(position>=0)
		{
			deleteposition(arr,position);
		}
		else
		{
			System.out.println(element+"Not found");
		}
	}

	public static void main(String[] args) {
		int arr[] = {10,23,20,35,6,88,23};
		int searchelement=23;
		int occurence=2;
		int position=1;
		int element=23;
		
		System.out.println("Index at first "+checkatfirst(arr,searchelement));
		System.out.println("Index at last "+checkatlast(arr,searchelement));
		System.out.println("Index by occurence "+checkbyoccurence(arr,searchelement,occurence));
		deleteposition(arr,position);
		deleteelement(arr,element);
		
		
	}

}
