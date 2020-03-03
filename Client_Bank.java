package com.jagsbank.bestbank;

import java.io.ObjectInputStream.GetField;

public class Client_Bank {

	public static void main(String[] args) {

		
		Main_Bank acc1 = new Main_Bank();
		
		System.out.println(acc1.getAccount_Number());
		
		acc1.setCustomer_Name("Jagadeesh");
		
		System.out.println(acc1.getCustomer_Name());
		
		acc1.Credit(1000);
		
		System.out.println(acc1.getAccount_Balance());
		
		acc1.Debit(7000);
		

		System.out.println(acc1.getAccount_Balance());
		
		
		
		
	}

}
