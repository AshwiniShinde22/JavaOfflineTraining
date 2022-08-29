package com.yash.assign2.ques1;
import java.util.logging.Logger;

public class Customer {
	static Logger logger = Logger.getLogger(Customer.class.getName());

	
	private String date_of_registration;
	private String delivery_address;
	private String contactno;
	private String email_id;


	public Customer() {

	}
	
	public static Logger getLogger() {
		return logger;
	}
	public static void setLogger(Logger logger) {
		Customer.logger = logger;
	}
	public String getDate_of_registration() {
		return date_of_registration;
	}
	public void setDate_of_registration(String date_of_registration) {
		this.date_of_registration = date_of_registration;
	}
	public String getDelivery_address() {
		return delivery_address;
	}
	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	@Override
	public String toString() {
		return "Customer [date_of_registration=" + date_of_registration + ", delivery_address=" + delivery_address
				+ ", contactno=" + contactno + ", email_id=" + email_id + "]";
	}
	
	public static void main(String[] args) {
		Department[] deptob = new Department[1];
		deptob[0] = new Department("111", "Development");

		Employee emp = new Employee();
		emp.setBase_location("Magarpatta");
		emp.setContactno("9807366379");
		emp.setDeptobj(deptob);
		emp.setDate_of_joining("22 december");
		emp.setEmailid("ashwini@gmail.com");
		emp.setSalary("25000");

		Customer cust = new Customer();
		cust.contactno = "8499470156";
		cust.date_of_registration = "2 june";
		cust.delivery_address = "YASH Hinjwadi";
		cust.email_id = "yash@.com";
		
		logger.info(emp.toString());
		
		System.out.println(cust.toString());
	}

}
