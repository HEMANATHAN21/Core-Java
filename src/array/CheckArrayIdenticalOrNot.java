package array;

public class CheckArrayIdenticalOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6,7};
		int arr1[]= {1,2,3,4,5,6,7};
		int count=0;
		if(arr.length == arr1.length)
		{
			for(int i=0;i<arr.length;i++)
			{
					if(arr[i] != arr1[i])
					{
						count=1;
						System.out.println("Not Identical");
						break;
					}
			}
			
		}
		else
		{
			System.out.println("Not Identical");
		}
		
		if(count == 0) 
		{
			System.out.println("Identical");
		}

	}

}
