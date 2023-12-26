package StringPgmClass;

public class RotateStringAndCheckEqualOrNot1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "IndVsAus";
		String s2= "IndVsAus";
		boolean res=false;
		if(s1.length()==s2.length())
		{
			String s3 = s1+s2;
			if(s2.contains(s1))
			{
				res=true;
			}
			else
			{
				res=false;
			}
		}
		else
		{
			res=false;
		}

		if(res)
		{
			System.out.println("It Is rotation");
		}
		else
		{
			System.out.println("Not");
		}
	}

}
