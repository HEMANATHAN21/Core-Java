package array;

public class FindMaxEleIn2DimArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[][]= {{1,2,3},{4,5,6}};
		
		int max=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				if(arr1[i][j] > max)
				{
					max=arr1[i][j];
				}
			}
		}
		System.out.println(max);

	}

}
