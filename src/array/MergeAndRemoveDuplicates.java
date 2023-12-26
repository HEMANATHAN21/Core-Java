package array;

import java.util.Arrays;

public class MergeAndRemoveDuplicates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {5,4,3,2,1,1};
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
		
		for(int i=0;i<mergearr.length;i++)
		{
			for(int j=i+1;j<mergearr.length-1;j++)
			{
				if(mergearr[j] == mergearr[j+1])
				{
					for(int k=j;k<mergearr.length-1;k++)
					{
						mergearr[k]=mergearr[k+1];
					}
					mergearr[mergearr.length-1]=0;
				}
			}
		}
		System.out.println(Arrays.toString(mergearr));
	}

}
