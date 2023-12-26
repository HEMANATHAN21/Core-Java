package Temp;

public class Strpattern {

	public static void main(String[] args) 
	{
		String str = "HEMA";
		
		for(int i=1;i<=str.length();i++)
		{
			char ch = str.charAt(i-1);
			
			for(int j=1;j<=str.length();j++)
			{
				if(i==j || i+j == 5)
				{
					System.out.print(""+ch);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
