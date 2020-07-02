/**
 * 
 */
package com.account;

public class Account {
	
	private int accountBalance;



	public void depositMoney(int amountToBeDeposited) {
		if (amountToBeDeposited > 0) {
		accountBalance += amountToBeDeposited;
		}
		
	}

	public int getAccountBalance() {
	
		return accountBalance;
	}

	public void withdrawMoney(int amountToWithdraw) {
		
		 accountBalance -= amountToWithdraw;
		
	}
	
}
