package Interface;

interface calculator
{
	double PI = 3.14;
	double add(int num1,int num2);
	double sub(int num1,int num2);
}

class calcimple implements calculator
{
	public double add(int num1,int num2)
	{
		return num1+num2;
	}
	public double sub(int num1,int num2)
	{
		return num1-num2;
	}
}
public class CalculatorExampleForInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PI Value Is : "+calculator.PI);
		calculator c = new calcimple();//upcasting
		System.out.println("Addition is "+c.add(100, 200));
		System.out.println("Subtraction is "+c.sub(100, 20));

	}

}
