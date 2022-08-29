package com.yash.assign2.ques5;

import java.util.logging.Logger;

public class D extends C{
	static Logger logger = Logger.getLogger(D.class.getName());

	@Override
	public int div(int a, int b) {
		return a=a/b;
		
		
	}

	public static void main(String[] args) {
		
		D d = new D();
		d.div(10, 20);
	    logger.info("Division :"+d.div(20, 5));
		logger.info("Multiplication :"+d.mul(5, 4));
		logger.info("Substraction :"+d.sub(20, 10));
		logger.info("Sum Of :"+d.sum(10, 10));
		
		
	}

	
}
