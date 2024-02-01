package array;

import java.util.Arrays;

public class MoveZeroInLast {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = {1,0,5,3,0,2,0,1,0,0};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == 0)
			{
				for(int j=i;j<arr.length-1;j++)
				{
					arr[j]=arr[j+1];
				}
				arr[arr.length-1]=0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
