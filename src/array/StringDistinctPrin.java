package array;

import java.util.Arrays;

public class StringDistinctPrin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "HEMAAAA";
		int count;
		char [] charr= s1.toCharArray();
		System.out.println(Arrays.toString(charr));
		boolean[]b=new boolean[charr.length];
		
		for(int i=0;i<charr.length;i++)
		{
			if(charr[i]!=0)
			{
				if(b[i]!=true) 
				{
					count=1;
			
					for(int j=i+1;j<charr.length;j++)
					{
						if(charr[i]==charr[j])
						{
							count++;
							b[j]=true;
						}
					}
				
					if(count==1)
					{
						System.out.println("Element Repeated  "+count+" Time Value Of "+charr[i]+" ");
					}
				}
			}
		//System.out.println(Arrays.toString(charr));
		}
	}
}
