package array;

import java.util.Arrays;

public class PrimeNoInArray {
	
	static void PrimeNo(int arr[])
	{
		int PrimeCount=0;
		double SumOfPrime=0;
		double AverageOfPrime=0;
		int temp[]=new int[arr.length];
		int temparr=0;
		int temparrmax=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=1;j<=arr[i];j++)
			{
				if(arr[i] % j == 0)
				{
					count++;
					//if(count>2)
						//break;
				}
			}
			if(count == 2)
			{
				System.out.println(arr[i]+" Is Prime No");
				PrimeCount++;
				SumOfPrime=SumOfPrime+arr[i];
				temp[temparr]=arr[i];
				temparr++;
			}
		}
		
		System.out.println("Prime Numbers Stored In Temporary Array : "+Arrays.toString(temp));
		
		for(int l=0;l<temp.length;l++)
		{
			
				if(temp[l]>temparrmax)
				{
					temparrmax=temp[l];
				}
		}
		
		
		
		AverageOfPrime=SumOfPrime / PrimeCount;
		System.out.println("Prime Count In Array Is : "+PrimeCount);
		System.out.println("Sum Of Prime Numbers Is : "+SumOfPrime);
		System.out.println("Average Of Prime Numbers Is : "+AverageOfPrime);
		System.out.println("Maximum Prime Num In Array : "+temparrmax);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,13};
		System.out.println(Arrays.toString(arr));
		PrimeNo(arr);
	}

}
