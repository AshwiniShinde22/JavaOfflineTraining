package com.yash.oops.ques3;

public class CustomerAccountStatement extends Customer {
	
	
	private int cAccId;
	private int amount;
	private int deposit_withdrawl;
	private String deposit_date;
	
	
	
	public CustomerAccountStatement(int cAccId, int amount, int deposit_withdrawl, String deposit_date
			) {
		super(deposit_withdrawl, deposit_date, deposit_date, deposit_date, deposit_date, deposit_date);
		this.cAccId = cAccId;
		this.amount = amount;
		this.deposit_withdrawl = deposit_withdrawl;
		this.deposit_date = deposit_date;
		
	}
	public int getcAccId() {
		return cAccId;
	}
	public void setcAccId(int cAccId) {
		this.cAccId = cAccId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getDeposit_withdrawl() {
		return deposit_withdrawl;
	}
	public void setDeposit_withdrawl(int deposit_withdrawl) {
		this.deposit_withdrawl = deposit_withdrawl;
	}
	public String getDeposit_date() {
		return deposit_date;
	}
	public void setDeposit_date(String deposit_date) {
		this.deposit_date = deposit_date;
	}
	@Override
	public String toString() {
		return "CustomerAccountStatement [cAccId=" + cAccId + ", amount=" + amount + ", deposit_withdrawl="
				+ deposit_withdrawl + ", deposit_date=" + deposit_date + "]";
	}
	
	
	
	

}
