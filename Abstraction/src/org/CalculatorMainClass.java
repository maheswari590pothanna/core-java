package org;

import java.util.Scanner;

public class CalculatorMainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("welcome to Calculator project");
		System.out.println(".......................");
		Calculator cal=new CalculatorImple();
		// upCasting to achieve abstraction
		Scanner sc=new Scanner(System.in);
		// to accept input from the use
		//cal.add(10,20);
		//cal.sub(23, 34);
		//cal.mul(20, 20);
		//cal.div(25, 5);
		while(true)// infinite loop
		{
			
			System.out.println("1:addition\n2:subtraction\n3:multiplication\n4:division");
			System.out.println("enter the choice");
			int choice=sc.nextInt();

			// a and b are the local variables  and local  variables do not have default values there fore initilizing with 0
			int a=0;
			int b=0;
// accepting two numbers only when choice is 1  2  3 4
			if(choice>=1 && choice<=4) {
				System.out.println("enter the a and b values to calculate");

				a=sc.nextInt();//
				b=sc.nextInt();
			}

			switch(choice)
			{
			case 1:cal.add(a, b);
			      break;
			      
			case 2:cal.sub(a, b);
			       break;
			       
			case 3:cal.mul(a, b);
			      break;
			      
			case 4:cal.div(a, b);
			      break;
			      
			case 5:
				System.out.println("thank you!");
			    System.exit(0);
			    
		default:
			System.out.println("send off too calcultor program..........................");
			}
		}
	}
}


