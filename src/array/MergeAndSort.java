package array;

import java.util.Arrays;

public class MergeAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {5,4,3,2,1};
		int arr2[]= {6,7,8,9,10};
		int pos=0;
		int temp;
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
		
		for(int i=0;i<mergearr.length;i++)
		{
			for(int j=0;j<mergearr.length-1;j++)
			{
				if(mergearr[j]>mergearr[j+1])
				{
					temp=mergearr[j];
					mergearr[j]=mergearr[j+1];
					mergearr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(mergearr));
	}

}
