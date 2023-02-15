package com.icici;

public class BankImp implements Bank {
	
	int balance;
	
	BankImp(int balance){
		this.balance=balance;
	}
	
	@Override
	public void deposite(int amount) {
		System.out.println("Depositing Rs."+amount);
		balance+=amount;	//balance=balance+balance;
		System.out.println("Amount Deposited Successfully");	
	}

	@Override
	public void withdraw(int amount) {
		if(amount<=balance) {
		System.out.println("Withdrawing Rs."+amount);
		balance-=amount;	//balance=balance-balance;
		System.out.println("Amount Withdrawn Successfully");
	}
		else {
			try {
				throw new InvalidBankBalanceException("Insefficient Balance");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	@Override
	public int getBalance() {
		return balance;
	}
}
