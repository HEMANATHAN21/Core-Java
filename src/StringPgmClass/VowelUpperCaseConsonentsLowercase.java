package StringPgmClass;

public class VowelUpperCaseConsonentsLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "AeIouclass";
		
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'A' ||ch == 'E' ||
					ch == 'I' ||ch == 'O' ||ch == 'U' )
			{
				if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' )
				{
					System.out.print((char)(ch-32));
				}
				else
				{
					System.out.print(ch);
				}
			}
			else if(ch>='A' && ch<='Z' ||ch>='a' && ch<='z')
			{
				if(ch>='a' && ch<='z')
				{
					System.out.print(ch);
				}
				else
				{
					System.out.print((char)(ch+32));
				}
			}
		}
		

	}

}
