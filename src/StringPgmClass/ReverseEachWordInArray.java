package StringPgmClass;

import java.util.Arrays;

public class ReverseEachWordInArray {
	public static void main(String[] args) {
		String s1 = "ALL IS WELL";
		String[] arr = s1.split(" ");
		String result="";
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			String word = arr[i];
			String rev="";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				rev = rev+word.charAt(j);
			}
			result = result+rev+" ";
		}
		System.out.println(result);
	}

}
