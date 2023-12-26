package StringPgmClass;

public class StringConvertLowerCaseAndUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "PROGRAMMING";
		
		
		/*for(int i=0;i<S1.length();i++)
		{
			int con = (int)S1.charAt(i)+32;
			char ch = (char)con ;
			System.out.print(ch+" ");
		}*/
		
		for(int i=0;i<S1.length();i++)
		{
			char ch = S1.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				System.out.print((char)(ch+32));
			}
		}
		System.out.println();
		String S2 =new String("solo");
		
		for(int i=0;i<S2.length();i++)
		{
			char ch = S2.charAt(i);
			if(ch>='a' && ch<='z')
			{
				System.out.print((char)(ch-32));
			}
		}

	}

}
