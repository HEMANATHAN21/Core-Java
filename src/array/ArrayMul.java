package array;

import java.util.Arrays;

public class ArrayMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++)
		{
			int mul=10;
			arr[i]=arr[i]*mul;
		}
		System.out.println(Arrays.toString(arr));
	}

}
