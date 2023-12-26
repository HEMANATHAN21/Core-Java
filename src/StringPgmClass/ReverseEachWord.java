package StringPgmClass;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ALL IS WELL";
		s=s+" ";
		String temp="";
		
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				temp=temp+ch; 
			}
			
			else
			{
				for(int j =temp.length()-1;j>=0;j--)
				{
					System.out.print(temp.charAt(j));
				}
				temp = "";
				System.out.print(" ");
			}
		}
	}

}
