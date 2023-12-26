package array;

public class ForEachPrint2DimArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [][]= {{1,2,3},{4,5,6},{7,8,9}};
		int fmax=0;
		int smax=0;
		int tmax=0;
		
		for(int[] x:arr)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
