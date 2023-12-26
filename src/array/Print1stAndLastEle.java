package array;

import java.util.Scanner;

public class Print1stAndLastEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Array Count : ");
		int count = sc.nextInt();
		int arr[]= new int[count];
		
		for(int i=0;i<count;i++)
		{
			System.out.print("arr["+i+"]= ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Output Is ");
		for(int i=0;i<count/2;i++)
		{
			int j=count-1;
			System.out.println(arr[i]+"->"+arr[j-i]);
		}

	}

}
