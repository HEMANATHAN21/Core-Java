package Collection;
import java.util.*;
public class SortedTreeSetBasedOnIDInEmployeeAppEmployerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<EmployeeAppEmployerclass> emps = new TreeSet<EmployeeAppEmployerclass>();
		
		emps.add(new EmployeeAppEmployerclass(10,"Hema",5000.0));
		emps.add(new EmployeeAppEmployerclass(8,"Varshan",10000.0));
		emps.add(new EmployeeAppEmployerclass(12,"Solo",7000.0));
		emps.add(new EmployeeAppEmployerclass(7,"Dilli",50000.0));

		for(EmployeeAppEmployerclass e1 :emps)
		{
			System.out.println(e1);
		}
	}

}
