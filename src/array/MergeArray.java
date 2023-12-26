package array;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {6,7,8,9,10};
		int mergearr[]=new int[arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length+arr2.length;i++)
		{
			if(i<arr1.length)
			{
				mergearr[i]=arr1[i];
			}
			else 
			{
				int j=0;
				j=i-arr2.length;
				
				mergearr[i]=arr2[j];
			}
		}
		
		System.out.println(Arrays.toString(mergearr));
		
		
	}

}
