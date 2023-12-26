package Collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class SortBySalary implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		EmployeeAppEmployerclass e1 =(EmployeeAppEmployerclass)o1;
		EmployeeAppEmployerclass e2 =(EmployeeAppEmployerclass)o2;
		
		if(e1.salary > e2.salary)
			return 5;
		else if(e1.salary < e2.salary)
			return -5;
		else
			return 0;
	}
	
}
public class SortedTreeSetSalaryInEmployeeAppclassUsingComparatorInterfacewithcompareMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<EmployeeAppEmployerclass> emps1 = new TreeSet<EmployeeAppEmployerclass>();
		
		emps1.add(new EmployeeAppEmployerclass(10,"Hema",5000.0));
		emps1.add(new EmployeeAppEmployerclass(8,"Varshan",10000.0));
		emps1.add(new EmployeeAppEmployerclass(12,"Solo",7000.0));
		emps1.add(new EmployeeAppEmployerclass(7,"Dilli",50000.0));
		
		for(EmployeeAppEmployerclass e1 :emps1)
		{
			System.out.println(e1);
		}
		System.out.println("--------------------------------------------");
		SortBySalary sbs = new SortBySalary();
		Set<EmployeeAppEmployerclass> emps2 = new TreeSet<EmployeeAppEmployerclass>(sbs);
		
		emps2.addAll(emps1);
		for(EmployeeAppEmployerclass e1 :emps2)
		{
			System.out.println(e1);
		}

	}

}
