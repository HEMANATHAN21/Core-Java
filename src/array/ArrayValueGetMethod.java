package array;

import java.util.Scanner;

public class ArrayValueGetMethod {
	 int[] arraymethod(int num)
	{
		int arr[]=new int[num];
		System.out.println("Enter Array Elements");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<num;i++)
		{
			System.out.print("arr["+i+"] = ");
			arr[i]=sc.nextInt();
		}
		return arr;
	}

}
