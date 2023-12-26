package array;

import java.util.Scanner;
import array.ArrayValueGetMethod;

public class FindLargestContiguesPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Array Count : ");
		int Arrcount = sc.nextInt();
		ArrayValueGetMethod avg = new ArrayValueGetMethod();
		int[]  arr = avg.arraymethod(Arrcount);
		int max =0;
		for(int i=0;i<arr.length-1;i++)
		{
			int sum = arr[i] + arr[i+1];
			if(sum > max)
			{
				max = sum;
				
			}
		}
		System.out.println("Maximum Contigues Pair Is : "+max);
	}

}
