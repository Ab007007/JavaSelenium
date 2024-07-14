package com.synechron.java.exceptions;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
		double balance = 5000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Bank Transaction");
		String cho = "n";
		do {
			System.out.println("1. Press 1 to credit\n 2. Press 2 to debit\n 3. Press 3 to check balance");

			int choice = sc.nextInt();
			switch (choice) {
			case 1: 
			{
				System.out.println("Enter the amount you want to credit");
				int amount = sc.nextInt();
				balance+= amount ;
				
				System.out.println("Your new balance is " + balance);
				break;
			}
			case 2: {
				System.out.println("Enter the amount you want to withdraw");
				int amount = sc.nextInt();
				double tempBalance = balance;

				tempBalance-= amount ;
				if(tempBalance <= 0)
				{
					try {
							throw new InsufficientBalanceException(balance);
					}
					catch(InsufficientBalanceException ex)
					{
						System.out.println(ex.getMessage());
						System.out.println("Balance is too low to make the transaction");
					}
				}
				else
				{
					balance = tempBalance;
					System.out.println("Your new balance is " + balance);
				}
				
				break;

			}
			case 3: {
					System.out.println("Your new balance is " + balance);
					break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
			System.out.println("Do you want to continue press y or n ???");
			cho = sc.next();
			
		}while(cho.equalsIgnoreCase("y"));
		


	}

}
