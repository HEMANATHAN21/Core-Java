package Collection;

public class EmployeeAppEmployerclass implements Comparable
{
	int id;
	String name;
	double salary;
	
	public EmployeeAppEmployerclass(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeAppEmployerclass [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public int hashCode()
	{
		return id;
	}
	
	public boolean equals(Object o1)
	{
		return this.hashCode() == o1.hashCode();
	}

	@Override
	public int compareTo(Object o)
	{
		return this.hashCode() - o.hashCode();//AscendingOrder
		//return o.hashCode() - this.hashCode();//AscendingOrder
		
		//CompareWithSalary
		/*EmployeeAppEmployerclass ref = (EmployeeAppEmployerclass)o;
		 * if(this.salary > ref.salary)
		 * 	return 5;
		 * else if(this.salary < ref.salary)
		 * 	return -5;
		 * else
		 * 	return 0;
		 */
		//ToCompareWithName
		//return this.name.compareTo(ref.name);
		
		
		
	}
	

}
