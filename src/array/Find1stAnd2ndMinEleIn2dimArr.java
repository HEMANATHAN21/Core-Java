package array;

public class Find1stAnd2ndMinEleIn2dimArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int firstmin=Integer.MAX_VALUE;
		int secondmin=Integer.MAX_VALUE;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				if(arr1[i][j] < firstmin)
				{
					secondmin=firstmin;
					firstmin=arr1[i][j];
					
				}
				else if(arr1[i][j]<secondmin)
				{
					secondmin=arr1[i][j];
				}
			}
		}
		System.out.println("First Minimum Value Is : "+firstmin);
		System.out.println("Second Minimum Value Is : "+secondmin);

	}

}
