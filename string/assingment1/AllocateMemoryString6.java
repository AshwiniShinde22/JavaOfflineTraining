package com.yash.string.assingment1;

import java.util.logging.Logger;

import com.yash.javatraining.StringExample;

public class AllocateMemoryString6 {

	static Logger logger = Logger.getLogger(StringExample.class.getName());
	
	public static void main(String[] args) {

		
		String str1 = "Yash ";
		logger.info("where is "+str1+" hashcode "+str1.hashCode());
		String str2 = "Yash Magarpatta";
		logger.info("where is "+str2+" hashcode "+str2.hashCode());
		String str3 = new String("Yash");
		logger.info("where is "+str3+" hashcode "+str3.hashCode());
		String name="";
		logger.info("where is "+name+" hashcode "+name.hashCode());
		
	}

}
