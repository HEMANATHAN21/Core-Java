package array;

public class FindFirstTwoMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,3,4};
		int fmin=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<fmin)
			{
				smin=fmin;
				fmin=arr[i];
			}
			else if(arr[i]<smin && arr[i]!=fmin)
			{
				smin=arr[i];
			}
		}
		System.out.println("The First Minimum Value Is "+fmin);
		System.out.println("The Second Minimum Value Is "+smin);


	}

}
