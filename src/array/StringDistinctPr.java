package array;

import java.util.Arrays;

public class StringDistinctPr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "SANGEEETHAA";
		int count;
		char [] charr= s1.toCharArray();
		System.out.println(Arrays.toString(charr));
		
		for(int i=0;i<charr.length;i++)
		{
				for(int j=0;j<i;j++)
				{
					if(charr[i]==charr[j])
					{
		
						break;
					}
					if(i==j)
					{
						System.out.println("Element Value Of "+charr[i]+" ");
					}
			
		}
		//System.out.println(Arrays.toString(charr));
	}
	}

}
