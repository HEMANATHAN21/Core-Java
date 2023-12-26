package array;

public class FindMineleIn1DimArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]= {{1,2,3},{4,5,6}};
		
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				if(arr1[i][j] < min)
				{
					min=arr1[i][j];
				}
			}
		}
		System.out.println(min);

	}

}
