package Walmart;

public class SecondMaxEleInArray 
{

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,6,5,6};
		int fmax = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>fmax)
			{
				smax = fmax;
				fmax = arr[i];
			}
			else if(arr[i] > smax && arr[i] != fmax)
			{
				smax = arr[i];
			}
		}
		
		System.out.println(smax);

	}

}
