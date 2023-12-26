package StringPgmClass;

public class InsertZeroInInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="12345";
		String temp="";
		
		for(int i=0;i<s1.length();i++)
		{
			temp = temp + s1.charAt(i) + "0";

		}
		System.out.println(temp);
	}

}
