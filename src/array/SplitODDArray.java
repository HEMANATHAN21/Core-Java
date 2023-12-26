package array;

import java.util.Arrays;

public class SplitODDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int split=arr.length+1;
		int splitarr1[] = new int[split/2]; 
		int splitarr2[] = new int[(split/2)-1];
		
		for(int i=0;i<arr.length;i++)
		{
			if(i<split/2)
			{
				splitarr1[i]=arr[i];
			}
			else
			{
				int j=0;
				j=i-(split/2);
				splitarr2[j]=arr[i];
			}
		}
		
		System.out.println(Arrays.toString(splitarr1));
		System.out.println(Arrays.toString(splitarr2));
		

	}

}
