package array;

import java.util.Arrays;

class removedupwioutarray
{
	 static void removeduplicates(int[] arr)
	{
		for(int l=0;l<arr.length;l++)
		{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						for(int k=j;k<arr.length-1;k++)
						{
							arr[k]=arr[k+1];
							
						}
						arr[arr.length-1]=0;
						//j=j-1;
					}
				}
			}
			
		}
		}
		System.out.println(Arrays.toString(arr));
	}
}
public class RemoveDuplicatesWithoutCreateNewArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,1,1,2,4,5,6,1,2,3,5,7,8,9};
		removedupwioutarray.removeduplicates(arr);
	}

}
