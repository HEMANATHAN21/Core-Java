package array;

public class FindOddEvenIndexElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5};
		System.out.println("Print Even");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Element Index is arr["+i+"]  Value is : "+arr[i]);
			}
		}
		System.out.println("Print odd");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd Element Index is arr["+i+"]  Value is : "+arr[i]);
			}
		}
	}

}
