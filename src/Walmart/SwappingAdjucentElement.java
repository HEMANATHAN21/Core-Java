package Walmart;

import java.util.Arrays;

public class SwappingAdjucentElement {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "abbaacbac";
		char[] arr = str.toCharArray();
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				if(arr[i] - arr[i+1] ==1)
				{
					char temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
