package array;

import java.util.Arrays;

public class MergeArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {6,7,8,9,10};
		int pos=0;
		int mergearr[]=new int[arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			mergearr[pos]=arr1[i];
			pos++;
		}
		for(int i=0;i<arr2.length;i++)
		{
			mergearr[pos]=arr2[i];
			pos++;
		}
		
		System.out.println(Arrays.toString(mergearr));
	}

}
