package array;
import java.util.*;

public class MatrixGettingRowsAndColumn {
	
	static void printarray(int row,int column,int arr[][])
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Size Of Row : ");
		int row = sc.nextInt();
		System.out.print("Enter The Size Of Column : ");
		int column = sc.nextInt();

		int arr [][] = new int[row][column];
		
		System.out.println("Enter the Matrix Values");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print("arr["+i+"] ["+j+"] : ");
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(arr));
		//printarray(row,column,arr);
		//reverse only i val
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr[i].length-1;j>=0;j--)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println();
		//Reverse in 3 2 1
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=arr[i].length-1;j>=0;j--)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}

}
