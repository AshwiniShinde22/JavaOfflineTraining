package com.yash.oops.ques3;

public class Branch {
	
	private int branchId;
	private String branchName;
	private String branchAddr;
	
	public Branch(int branchId, String branchName, String branchAddr) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchAddr = branchAddr;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchAddr() {
		return branchAddr;
	}
	public void setBranchAddr(String branchAddr) {
		this.branchAddr = branchAddr;
	}
	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchName=" + branchName + ", branchAddr=" + branchAddr + "]";
	}
	
	
	
}
