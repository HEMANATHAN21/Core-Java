package array;

import java.util.Arrays;

public class PrintLasFirAndLasBefAndFirAft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		int temp[]=new int[arr.length-1];
		int pos=0;
		int mid = arr.length/2;
		int len=arr.length-1;
		System.out.println("Mid Position Is : "+mid);
		System.out.println("Length is : "+len);
		
		for(int i=0;i<=arr.length/2;i++)
		{
			
			if(i==mid)
			{
				//temp[pos]=arr[val];
				//pos++;
			}
			else
			{
				for(int j=len-i;j<arr.length;j++)
				{
					
					temp[pos]=arr[j];
					pos++;
					break;
				
				}
				
				for(int k=i;k<arr.length;k++)
				{
					temp[pos]=arr[k];
					pos++;
					break;

				}
			}
		}
		
		System.out.println(Arrays.toString(temp));
	}

}
