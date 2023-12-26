package StringPgmClass;

public class SubstringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "sir";
		
		//System.out.println(s1.substring(0, 5));
		//System.out.println(s1.substring(0, 0));
		for(int i=0;i<s1.length();i++)
		{
			for(int j = i;j<s1.length();j++)
			{
					System.out.print(s1.substring(i, j+1));
					System.out.println();
			}
			
		}
	}

}
