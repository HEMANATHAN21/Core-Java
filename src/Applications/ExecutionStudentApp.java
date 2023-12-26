package Applications;

import java.util.Scanner;

public class ExecutionStudentApp {

	public static void main(String[] args) {
		
		System.out.println("---------------------------------------------------------");
		StudentAppUsingArray std1 = new StudentAppUsingArray(001,"HEMANATHAN",new double[]{100,80,70});
		System.out.println(std1);
		System.out.println("Total marks Is : "+std1.totalmarks());
		System.out.println("Average Is : "+std1.average());
		System.out.println("Result : "+std1.result());
		System.out.println("---------------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student ID : ");
		int id = sc.nextInt();
		System.out.print("Enter Student NAME : ");
		String name = sc.next();
		double marks [] = new double [3];
		
		for(int i=0;i<3;i++)
		{
			System.out.print("Enter Subject "+(i+1)+" Marks : ");
			marks[i] = sc.nextDouble();
		}
		
		System.out.println("---------------------------------------------------------");
		StudentAppUsingArray std2 = new StudentAppUsingArray(id,name,marks);
		System.out.println(std2);
		System.out.println("Total marks Is : "+std2.totalmarks());
		System.out.println("Average Is : "+std2.average());
		System.out.println("Result : "+std2.result());
		System.out.println("---------------------------------------------------------");
	}

}
