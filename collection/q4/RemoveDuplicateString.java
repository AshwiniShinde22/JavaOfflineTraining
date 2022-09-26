package com.yash.collection.q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class RemoveDuplicateString {

	static Logger logger = Logger.getLogger(RemoveDuplicateString.class.getName());
	
	
	public static void main(String[] args) {

		BasicConfigurator.configure();
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("laptop");
		list.add("keyboard");
		list.add("laptop");
		list.add("mouse");
		list.add("mouse");
		list.add("keyboard");
		list.add("mobile");
		list.add("table");
		
		logger.info(list);
		Collections.sort(list, Collections.reverseOrder());
		Set<String> set = new LinkedHashSet<>(list);
		
		
		logger.info(set);
		
		
	}

}
