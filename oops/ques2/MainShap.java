package com.yash.oops.ques2;

import java.util.Scanner;
import java.util.logging.Logger;

public class MainShap {
	static Logger logger = Logger.getLogger(MainShap.class.getName());

	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		Square s = new Square();
		
		logger.info(" area of Traingle =" + t.area());
		logger.info("area of Riactangle =" + r.area());
		logger.info("area of Square =" + s.area());
		
		
	}

	

}
