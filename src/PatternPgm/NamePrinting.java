package PatternPgm;

public class NamePrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****************************************************************************************************");
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==3 || j==1 ||j==5)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			

			for(int j=1;j<=5;j++)
			{
				if(i==3 || j==1 || i==1 || i==5)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			
			for(int j=1;j<=5;j++)
			{
				if(j==1 || j==5 || i+j==4 && i*j==4 || i+j==6 && i*j==8 && i==2 || i+j==6 && i*j==9 && i==3)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			
			for(int j=1;j<=5;j++)
			{
				if(j==1 || j==5 || i==1 || i==3)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			
			
			for(int j=1;j<=5;j++)
			{
				if(j==1 || j==5 || i==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			
			for(int j=1;j<=5;j++)
			{
				if(j==1 || j==5 || i==1 || i==3)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			
			for(int j=1;j<=5;j++)
			{
				if(i==1 || j==3)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			
			for(int j=1;j<=5;j++)
			{
				if(j==1 || j==5 || i==3)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			
			
			System.out.println();
		}
		System.out.println();
		System.out.println("*****************************************************************************************************");
	}

}
