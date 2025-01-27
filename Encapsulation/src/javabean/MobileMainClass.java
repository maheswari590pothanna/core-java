package javabean;
import java.util.Scanner;
public class MobileMainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the brand");
		String brand=sc.next();
		System.out.println("enter the cost");
		int cost=sc.nextInt();
		sc.close();                     // it is optional but good practice
		Mobile m=new Mobile();
		m.setBrand(brand);

		System.out.println(m.getBrand());
		m.setCost(cost);

		System.out.println(m.getCost());

	}

}
