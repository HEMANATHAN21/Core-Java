package COMPOSITION;

class Address
{
	int doorno;
	String streetname;
	String city;
	long pincode;
	public Address(int doorno, String streetname, String city, long pincode) {
		super();
		this.doorno = doorno;
		this.streetname = streetname;
		this.city = city;
		this.pincode = pincode;
	}
	
}

class Employee
{
	static String companyname = "ZOHO";
	static Address OfficeAddress = new Address(14,"Zoho street","chennai",600024);
	int empid;
	String empname;
	double empsalary;
	Address empresidence;
	public Employee(int empid, String empname, double empsalary, Address empresidence) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empresidence = empresidence;
	}
	
}

public class EmployeeApWithComposition 
{
	public static void main(String[] args)
	{
		System.out.println("************************************");
		System.out.println("Company Name Is : "+Employee.companyname);
		System.out.println("No : "+Employee.OfficeAddress.doorno+"\nStreet Name : "+Employee.OfficeAddress.streetname+"\nCity Name : "+Employee.OfficeAddress.city+"\nPinCode : "+Employee.OfficeAddress.pincode);
		Employee empinfo = new Employee(01,"HEMANATHAN",500000.00,new Address(141,"Bajanai kovil Street","Chengalpattu",603109));
		System.out.println("Employee Info");
		System.out.println("Employee ID : "+empinfo.empid);
		System.out.println("Employee NAME : "+empinfo.empname);
		System.out.println("Employee SALARY : "+empinfo.empsalary);
		System.out.println("Employee DOOR NO : "+empinfo.empresidence.doorno);
		System.out.println("Employee STREET NAME : "+empinfo.empresidence.streetname);
		System.out.println("Employee CITY NAME : "+empinfo.empresidence.city);
		System.out.println("Employee PINCOE : "+empinfo.empresidence.pincode);
		
		System.out.println("************************************");
	}
	

}
