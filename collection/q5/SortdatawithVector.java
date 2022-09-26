package com.yash.collection.q5;

import java.util.Collections;
import java.util.Vector;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class SortdatawithVector {

	static Logger logger = Logger.getLogger(SortdatawithVector.class.getName());
	public static void main(String[] args) {

		BasicConfigurator.configure();
		Vector<String> colors = new Vector<>();
		
		colors.add("pink");
		colors.add("blue");
		colors.add("red");
		colors.add("yellow");
		colors.add("green");
		colors.add("black");
		
		logger.info(colors);
		
		Collections.sort(colors);
		logger.info(colors);
	}

}
