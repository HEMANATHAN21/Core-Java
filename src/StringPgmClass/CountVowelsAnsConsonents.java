package StringPgmClass;

public class CountVowelsAnsConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "aeiou&%";
		int vowelscount = 0;
		int consonentscount = 0;
		
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'A' ||ch == 'E' ||
					ch == 'I' ||ch == 'O' ||ch == 'U' )
			{
				vowelscount++;
			}
			else
			{
				consonentscount++;
			}
		}
		System.out.println("Vowels count is "+vowelscount);
		System.out.println("Consonents count is "+consonentscount);

	}

}
