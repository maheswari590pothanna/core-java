package com;

import java.util.Scanner;

public class BanckMainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter depositing amount");
		int dep=sc.nextInt();
		System.out.println("entr amount to withdraw");
		int wit=sc.nextInt();
		Bank b=new BankImple();
		b.deposit(dep);
		b.checkbalance();
		System.out.println("..........................");
		b.withdraw(wit);
		b.checkbalance();
		System.out.println("hehhhehhehhe");
		sc.close();
	}

}
