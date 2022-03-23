package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		
		Account acc = new Account(1001, "Alex", 1000.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING 
		
		Account acc1 = bacc;
		acc1.getBalance();
		Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3; erro pois a acc 3 é uma SavingsAccount e não BusinessAccount.
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");			
		}
		
		acc.withdraw(200.0);
		System.out.println(acc.getBalance());
		
		Account accx = new SavingsAccount(1007, "Maria", 1000.0, 0.01);
		accx.withdraw(200.0);
		System.out.println(accx.getBalance());
		
		Account acc0 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc0.withdraw(200.0);
		System.out.println(acc0.getBalance());
		
		*/
		
		// POLIMORFISMO 
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1021, "Maria", 1000.0,0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		
		
		sc.close();
	}

}
