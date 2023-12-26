package array;

import java.util.Arrays;

public class SortHalfOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5,4,3,2,1,0};
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length/2-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
			for(int j=arr.length/2;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
