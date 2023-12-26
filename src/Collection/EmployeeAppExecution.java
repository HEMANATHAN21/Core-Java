package Collection;
import java.util.*;
public class EmployeeAppExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<EmployeeAppEmployerclass> emp = new HashSet<EmployeeAppEmployerclass>();//not preserve insertion order
		Set<EmployeeAppEmployerclass> emp = new LinkedHashSet<EmployeeAppEmployerclass>();//preserve insertion order
		emp.add(new EmployeeAppEmployerclass(123,"hema",2000.0));
		emp.add(new EmployeeAppEmployerclass(456,"solo",2000.0));
		emp.add(new EmployeeAppEmployerclass(123,"hema",2000.0));
		
		for(EmployeeAppEmployerclass e1 : emp)
		{
			System.out.println(e1);
		}
	}

}
