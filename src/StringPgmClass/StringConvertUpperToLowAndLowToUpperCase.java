package StringPgmClass;

public class StringConvertUpperToLowAndLowToUpperCase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "proGrAMMing12@$";
		String S2 = "";
		
		/*for(int i=0;i<S1.length();i++)
		{
			char ch = S1.charAt(i);
			if(ch>='a' && ch<='z')
			{
				System.out.print((char)(ch-32));

			}
			else if(ch>='A' && ch<='Z')
			{
				System.out.print((char)(ch+32));

			}
			else
			{
				System.out.print(ch);
			}
		}*/
		////////////////ORRRR///////////////
		int LowerCount=0;
		int UpperCount=0;
		int NumberCount=0;
		int SpecialCount=0;
		
		for(int i=0;i<S1.length();i++)
		{
			char ch = S1.charAt(i);
			if(ch>='a' && ch<='z')
			{
				S2=S2+(char)(ch-32);
				LowerCount++;

			}
			else if(ch>='A' && ch<='Z')
			{
		
				S2=S2+(char)(ch+32);
				UpperCount++;
			}
			else if(ch>='0' && ch<='9')
			{
				S2=S2+(ch);
				NumberCount++;
			}
			else
			{
				S2=S2+(ch);
				SpecialCount++;
			}
		}
		System.out.println(S2);
		System.out.println("Lower char Count Is : "+LowerCount);
		System.out.println("Upper char Count Is : "+UpperCount);
		System.out.println("Number char Count Is : "+NumberCount);
		System.out.println("Special char Count Is : "+SpecialCount);

	}

}
