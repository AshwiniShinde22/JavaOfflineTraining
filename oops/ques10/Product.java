package com.yash.oops.ques10;

import java.util.logging.Logger;

public class Product implements Cloneable{

	static Logger logger = Logger.getLogger(Product.class.getName());
	 private int pid;
	 private String pname;
	 private double price;
	 private float unitOfMeasurement;
	 
	
	public Product(int pid, String pname, double price, float unitOfMeasurement) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.unitOfMeasurement = unitOfMeasurement;
	}


	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public float getUnitOfMeasurement() {
		return unitOfMeasurement;
	}
	public void setUnitOfMeasurement(float unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}

	void display() {
		logger.info("pid "+pid);
		logger.info("name "+pname);
		logger.info("price "+price);
		logger.info("unit "+unitOfMeasurement);
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Product p=new Product(1, "ashwini", 4000d, 3.4f);
		Product c=(Product) p.clone();
		c.display();
		
		logger.info("change the object value and check incetance of");
		c.setPname("namrata");
		c.setPrice(3000d);
		c.display();
		System.out.println(c instanceof Product);
	}

}
