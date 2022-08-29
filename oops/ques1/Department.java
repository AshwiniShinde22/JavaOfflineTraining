package com.yash.oops.ques1;

public class Department {

	private String deptid;
    private String dname;
    
    
	public String getDeptid() {
		return deptid;
	}
	
	public Department(String deptid, String dname) {
		super();
		this.deptid = deptid;
		this.dname = dname;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}

	public Department() {
		super();
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", dname=" + dname + "]";
	}
	
	
}
