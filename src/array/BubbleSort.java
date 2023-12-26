package array;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
        int arr[]={5,4,3,2,1};
        for(int k=0;k<arr.length;k++)
        {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                
            }
        }
    }
        System.out.println(Arrays.toString(arr));

	}

}
