package array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int num = arr.length-1;
		//System.out.println(num);
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i != (num - i))
			{
				temp = arr[i];
				arr[i] = arr[num-i];
				arr[num - i] = temp;
			}
			
			else if(i == (num - i))
			{
				break;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		

	}

}
