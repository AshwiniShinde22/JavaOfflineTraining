package com.yash.assign2.ques3;

public class Customer extends Branch {
	
	private int custId;
	private String custName;
	private String custAddress;
	private String accNo;
	private String dob;
	private String accOpenDate;
    
	
	
	public Customer(int custId, String custName, String custAddress, String accNo, String dob, String accOpenDate)
	 {
		super(custId, accOpenDate, accOpenDate);
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.accNo = accNo;
		this.dob = dob;
		this.accOpenDate = accOpenDate;
	
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAccOpenDate() {
		return accOpenDate;
	}
	public void setAccOpenDate(String accOpenDate) {
		this.accOpenDate = accOpenDate;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + ", accNo="
				+ accNo + ", dob=" + dob + ", accOpenDate=" + accOpenDate + "]";
	}
	
	
	
	
	
}
