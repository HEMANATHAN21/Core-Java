package StringPgmClass;

public class CheckPanagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String s2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZZZZSSSSS";
		int count = 0;
		
		if(s1.length() <= s2.length())
		{

			for(int i=0;i<s1.length();i++)
			{
				char ch1 = s1.charAt(i);
				{
					for(int j=0;j<s2.length();j++)
					{
						char ch2 = s2.charAt(j);
					
						if(ch1 == ch2)
						{
							count++;
							break;
							
						}
					}
				}
		
			}
			if(count == 26)
				System.out.println("Anagram");
			else
				System.out.println("Not Anagram");
		}
		else
				System.out.println("Not Anagram");
	}
}
