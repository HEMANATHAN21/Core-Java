package array;

public class SumofAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5};
		int sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			count++;
			sum=sum+arr[i];
		}
		
		System.out.println("Sum of Array is : "+sum);
		System.out.println("Average of Array is : "+sum/count);
	}

}
