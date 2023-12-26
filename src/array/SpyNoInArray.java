package array;

public class SpyNoInArray {
	
	static void SpyNo(int arr[])
	{
		int remainder;
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			int sum=0;
			int product=1;
			
			while(num>0)
			{
				remainder=num%10;
				sum=sum+remainder;
				product=product*remainder;
				num=num/10;
			}
			
			if(sum==product)
			{
				System.out.println(arr[i]+ " Is Spy No");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {123,234,11};
		SpyNo(arr);
		

	}

}
