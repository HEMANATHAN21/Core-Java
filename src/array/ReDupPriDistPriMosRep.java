package array;

import java.util.Arrays;

public class ReDupPriDistPriMosRep {

	public static void main(String[] args) {
		String s1 = "PROGRAMMING";
		char [] charr= s1.toCharArray();
		System.out.println(Arrays.toString(charr));
		
		for(int i=0;i<charr.length;i++)
		{
			for(int j=i+1;j<charr.length;j++)
			{
				if(charr[i]==charr[j])
				{
					for(int k=j;k<charr.length-1;k++)
					{
						charr[k]=charr[k+1];
					}
					charr[charr.length-1]=0;
				}
			}
		}
		System.out.println(Arrays.toString(charr));

	}

}
