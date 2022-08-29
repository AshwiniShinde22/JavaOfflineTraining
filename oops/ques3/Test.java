package com.yash.oops.ques3;

import java.util.logging.Logger;

public class Test {
	
	static Logger logger =Logger.getLogger(Test.class.getName());

	public static void main(String[] args) {

		 CustomerAccountStatement c = new CustomerAccountStatement(100, 8272, 2328763,"2/3/2022");
		 logger.info("details"+c.toString());
		 
		 
	}

}
