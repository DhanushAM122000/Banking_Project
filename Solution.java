package com.icici;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		//Scanner
		Scanner scan=new Scanner(System.in);
		
		//upcasting -> Bank & Imp
		Bank b=new BankImp(500);
		
		//while(true)->to run program until condition is false
		while(true) {
			
			//display the menu->menu driven programs 1:Deposit 2:Withdraw 3:getBalance4:Exit
			System.out.println("-----WELCOME TO BANK-----");
			System.out.println("1.Deposite\n2.Withdraw\n3.getBalance\n4.Exit\nEnter Your choice");
			
			//Switch()
			
			int choice =scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the amount to Deposite:");
				int amountToDeposite=scan.nextInt();
				b.deposite(amountToDeposite);//b.deposit(scan.nextInt)
				break;
				
			case 2:
				System.out.println("Enter the amount to Withdrawn");
				int amountToWithdrawn=scan.nextInt();
				b.withdraw(amountToWithdrawn);//b.withdrawn(scan.nextInt)
				break;
				
			case 3:
				System.out.println("Avalible Balance: Rs."+b.getBalance());
				break;
				
			case 4:
				
				System.out.println("Thank You");
				System.exit(0);
				break;
				
				default :
					
					try {
						throw new  InvalidChoiceException("Invalid choice"); 
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
				}
			
			System.out.println("-------------------");
		}
		
		}
		
		
	}


