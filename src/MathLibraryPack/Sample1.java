package MathLibraryPack;

import java.util.Random;

public class Sample1 {
	
	static String generateotp(int n)
	{
		String otp="";
		otp=otp+(int)(Math.random()*10)
				+(int)(Math.random()*10)
				+(int)(Math.random()*10)
				+(int)(Math.random()*10);
		return otp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.pow(3, 4));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.cbrt(27));
		System.out.println(Math.max(10, 30));
		System.out.println(Math.min(10, 30));
		System.out.println(Math.floor(5.6));
		System.out.println(Math.ceil(5.6));
		System.out.println(Math.round(4.5));
		System.out.println(Math.abs(5.6));
		System.out.println(Math.log(10));
		System.out.println(Math.random());
		//System.out.println(math.);
		
		String otp="";
		
		for(int i=0;i<4;i++)
		{
			otp=otp+(int)(Math.random()*10);
		}
		
		
		System.out.println(otp);
		Random r1 = new Random();
		System.out.println(r1.nextInt());
	}

}
