package array;

import java.util.Arrays;

public class SringDupliRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "PROGRAMMINGM";
		char [] charr= s1.toCharArray();
		char [] distcharr=s1.toCharArray();
		char [] mostreparr=s1.toCharArray();
		System.out.print("Array is : ");
		System.out.println(Arrays.toString(charr));
		//System.out.println(Arrays.toString(distcharr));
		
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
		System.out.print("Duplicates Removed Array Is : ");
		System.out.println(Arrays.toString(charr));
		///////////////////////////////
		System.out.println("Print Unique Element");
		System.out.println(Arrays.toString(distcharr));
		
		int count;

		boolean[]b=new boolean[distcharr.length];
		
		for(int i=0;i<distcharr.length;i++)
		{
			if(distcharr[i]!=0)
			{
				if(b[i]!=true) 
				{
					count=1;
			
					for(int j=i+1;j<distcharr.length;j++)
					{
						if(distcharr[i]==distcharr[j])
						{
							count++;
							b[j]=true;
						}
					}
				
					if(count==1)
					{
						System.out.println("Element Repeated  "+count+" Time Value Is "+distcharr[i]+" ");
					}
				}
			}
		//System.out.println(Arrays.toString(charr));
		}
		
		/////////////////////////////////////////////////
		boolean[] visited = new boolean[mostreparr.length];
		int occurencecount=0;
		char element=' ';
		
		for(int i=0;i<mostreparr.length;i++)
		{
			if(visited[i]==false)
			{
				int maxcount =1;
				
				for(int j=i+1;j<mostreparr.length;j++)
				{
					if(mostreparr[i]==mostreparr[j])
					{
						maxcount++;
						visited[j]=true;
					}
				}
				if(maxcount>1)
				{
					if(maxcount>occurencecount)
					{
						occurencecount=maxcount;
						element=mostreparr[i];
					}
				}
				
			}
		}
		
		System.out.println("Most Repeated Element Is : "+element);
	}

}
