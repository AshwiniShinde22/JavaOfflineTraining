package com.yash.collection.q1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class SortingwithCollection {

	static Logger logger = Logger.getLogger(SortingwithCollection.class.getName());
	public static void main(String[] args) {
		BasicConfigurator.configure();
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ashwini");
		list.add("Pooja");
		list.add("Namrata");
		list.add("Sneha");
		list.add("Gauri");
		logger.info(list);
		Collections.sort(list);
		logger.info("List is after sorting"+list);
		
		
	}
}
