package array;

import java.util.Arrays;

public class ReverseArrayIn2DimBySwap {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{7,8,9},{4,5,6},{7,8,9}};
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length/2;j++)
			{
				
				 temp=arr[i][j];
				 arr[i][j]=arr[i][arr.length-j-1];
				 arr[i][arr.length-j-1]=temp;
			}
		}
		System.out.println(Arrays.deepToString(arr));

	}

}
