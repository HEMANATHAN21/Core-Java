package PatternPgm;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
				{
					System.out.print(i+" ");
				}
				else if(i+j==6)
				{
					System.out.print((6-i)+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		String s1="PROGRAM";
		
		for(int l=1;l<=s1.length();l++)
		{
			for(int m=1;m<=s1.length();m++)
			{
				if(l==m)
				{
					System.out.print(s1.charAt(l-1)+" ");
				}
				else if(l+m== s1.length()+1)
				{
					System.out.print((s1.charAt(s1.length()-l))+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
