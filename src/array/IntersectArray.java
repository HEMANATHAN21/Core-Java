package array;

import java.util.Arrays;

public class IntersectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {5,6,7,5,4};
		int arr2[]= {5,7,4,2,1};
		int newarr[]=new int[arr1.length];
		int position=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr2.length;j++)
			{
				if(arr1[i] == arr1[j])
				{
					
					arr1[j]=0;
					
				}
			}
			
			for(int k=0;k<arr2.length-1;k++)
			{
				if(arr1[i] == arr2[k])
					{
						newarr[position]=arr1[i];
						position++;
						break;
						
					}
			}
		}
		
		System.out.println(Arrays.toString(newarr));
		
	}

}
