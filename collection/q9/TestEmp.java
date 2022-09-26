package com.yash.collection.q9;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class TestEmp {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(101, "Ashwini", 38999, "dev", "pune"));
		list.add(new Employee(101, "pooja", 40000, "hr", "chandannagar"));
		list.add(new Employee(101, "isha", 35589, "test", "magarpatta"));
		list.add(new Employee(101, "namrata", 499999, "dev", "koregao"));
		list.add(new Employee(101, "gauri", 46899, "hr", "hinjewadi"));
		list.add(new Employee(101, "neha", 327778, "dev", "dehuroad"));
		System.out.println(list);
		 
		
	}

}
