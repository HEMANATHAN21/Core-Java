package array;

public class Find1stAnd2ndMaxElein2dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]= {{1,2,3},{4,5,6},{9,8,9}};
		
		int firstmax=0;
		int secondmax=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				if(arr1[i][j] > firstmax)
				{
					secondmax=firstmax;
					firstmax=arr1[i][j];
					
				}
				else if(arr1[i][j]>secondmax && arr1[i][j] != secondmax)
				{
					secondmax=arr1[i][j];
				}
			}
		}
		System.out.println("First Maximum Value Is : "+firstmax);
		System.out.println("Second Maximum Value Is : "+secondmax);
	}

}
