package com.yash.oops.ques11;

public class Employee extends Date{
	
	private int empid;
	private String empname;
	private String empsalary;
	private String empaddress;
	
	
	
	
	public Employee(int empid, String empname, String empsalary, String empaddress,String i,String j ) {
		super(i,j);
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empaddress = empaddress;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(String empsalary) {
		this.empsalary = empsalary;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empaddress="
				+ empaddress + ", getEmp_dob()=" + getEmp_dob() + ", getEmp_doj()=" + getEmp_doj() + "  ]";
	}
	
}
