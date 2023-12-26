package array;

import java.util.Arrays;

public class PrintOddEveninSameArraTwoBlo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,7,1,2,3,4,5,6};
		int pos=0;
		int newarr[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				
				newarr[pos]=arr[i];
				pos++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				
				newarr[pos]=arr[i];
				pos++;
			}
		}
		System.out.println(Arrays.toString(newarr));

	}

}
