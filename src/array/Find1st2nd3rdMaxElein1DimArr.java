package array;

public class Find1st2nd3rdMaxElein1DimArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]= {{1,2,3},{4,5,11},{11,8,9},{10,0,0}};
		
		int firstmax=0;
		int secondmax=0;
		int thirdmax=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				if(arr1[i][j] > firstmax)
				{
					thirdmax=secondmax;
					secondmax=firstmax;
					firstmax=arr1[i][j];
					
				}
				else if(arr1[i][j]>secondmax && arr1[i][j] !=firstmax)
				{
					thirdmax=secondmax;
					secondmax=arr1[i][j];
				}
				else if(arr1[i][j]>thirdmax && arr1[i][j] !=secondmax && arr1[i][j] !=firstmax)
				{
					thirdmax=arr1[i][j];
				}
			}
		}
		System.out.println("First Maximum Value Is : "+firstmax);
		System.out.println("Second Maximum Value Is : "+secondmax);
		System.out.println("Third Maximum Value Is : "+thirdmax);
	}

}
