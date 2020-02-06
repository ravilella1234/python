package com.icici.loans.carloans;

public class Icici implements Rbi
{

	
	@Override
	public void withdrawl() {
		System.out.println("Iam overriden withdrawl from ICICI");
	}

	@Override
	public void deposit() {
		System.out.println("Iam overriden deposit from ICICI");
	}
	
	public static void main(String[] args) {
		Icici i=new Icici();
		i.deposit();
		i.withdrawl();
	}
}
