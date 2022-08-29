package com.yash.oops.ques11;

import java.util.logging.Logger;

public class Test {

	static Logger logger = Logger.getLogger(Test.class.getName());
	public static void main(String[] args) {
   
		
		Employee e = new Employee(1,"Ashwini","20000","pune","13/2/2022","14/7/2019");
		
		logger.info(e.toString());
		
		
	}

}
