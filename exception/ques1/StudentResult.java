package com.yash.exception.ques1;

public class StudentResult 
{
	
	private int id;
	private int sub1;
	private int sub2;
	private int sub3;
	private int sub4;
	private int sub5;
		
	
	public StudentResult(int id, int sub1, int sub2, int sub3, int sub4, int sub5) {
		super();
		this.id = id;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
	}


	public StudentResult() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getSub1() {
		return sub1;
	}


	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}


	public int getSub2() {
		return sub2;
	}


	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}


	public int getSub3() {
		return sub3;
	}


	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}


	public int getSub4() {
		return sub4;
	}


	public void setSub4(int sub4) {
		this.sub4 = sub4;
	}


	public int getSub5() {
		return sub5;
	}


	public void setSub5(int sub5) {
		this.sub5 = sub5;
	}



	@Override
	public String toString() {
		return "Subjects [id=" + id + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + ", sub4=" + sub4
				+ ", sub5=" + sub5 + "]";
	}
	
	
	
	
	
}
