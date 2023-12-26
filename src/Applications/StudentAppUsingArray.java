package Applications;

import java.util.Arrays;

public class StudentAppUsingArray 
{
	int id;
	String name;
	double [] marks;
	
	public StudentAppUsingArray(int id, String name, double[] marks) 
	{
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	double totalmarks()
	{
		double total = 0.0;
		
		for(double mark : marks)
		{
			total = total + mark;
		}
		return total;
	}
	
	double average()
	{
		return totalmarks() / marks.length;
	}
	
	String result()
	{
		String res = "PASS";
		for(double mark : marks)
		{
			if(mark <35)
			{
				res = "FAIL";
				break;
			}
		}
		return res;
	}

	@Override
	public String toString() 
	{
		return "StudentAppUsingArray : [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + "]";
	}
	
	
}
