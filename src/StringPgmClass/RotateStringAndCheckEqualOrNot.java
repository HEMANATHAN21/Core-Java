package StringPgmClass;

import java.util.Arrays;
import java.util.Scanner;

public class RotateStringAndCheckEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1St String : ");
		String s1 = sc.nextLine();
		s1= s1+" ";
		String s2 = "PAKISTAN VS INDIA";
		String temp = "";
		System.out.println("1St String is "+s1);
		String arr[] =s2.split(" ");
		System.out.println(Arrays.toString(arr));
		for(int i=arr.length-1;i>=0;i--)
		{
			String ch =arr[i];
			
			temp = temp+ch+" ";
		}
		System.out.println("Rotated String Is "+temp);
		System.out.println(s1.equals(temp));
	}

}
