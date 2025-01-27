package javabean;
import java.util.Scanner;
public class EmployeeMainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter salary");
		double salary=sc.nextDouble();
		Employee e=new Employee();
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		System.out.println("id:"+e.getId());
		System.out.println("name:"+e.getName());
		System.out.println("salary:"+e.getSalary()+" "+"LPA");
	}

}
