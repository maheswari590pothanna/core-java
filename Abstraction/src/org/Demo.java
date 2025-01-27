package org;

import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args)
	{
Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("entr the choice");
			int choice=sc.nextInt();
	
			switch(choice)
			{
			case 1:System.out.println("hiii");
			break;
			case 2:System.out.println("byee");
			break;
			case 3:System.out.println("eeee");
			break;
			case 4:
				System.out.println("thank you!............eeeee");
				System.exit(0);
			default:System.out.println("invalid and send off to program");
			}
			System.out.println(" -----");
		}
	}
}

	
