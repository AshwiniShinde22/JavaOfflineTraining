package com.yash.oops.ques8;

import java.util.logging.Logger;

public class Test {

	static Logger logger = Logger.getLogger(Test.class.getName());
	public static void main(String[] args) {

		Electornics electornics = new Electornics(101, "gallium", "03/01/1993");
		Electornics lcd = new LCD(102, "crystal", "13/11/1994");
		Electornics mobile = new Mobile(103, "Apple", "23/09/2021");
		
		logger.info("Electronics Info: "+electornics);
		logger.info("LCD Info: "+lcd);
		logger.info("Mobile Info: "+mobile);
		
		
		
	}

}
