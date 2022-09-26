package com.yash.collection.q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class RemoveDuplicateNo {

	static Logger logger = Logger.getLogger(RemoveDuplicateNo.class.getName());
	
	
	public static  <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
	{
		
		Set<T> set = new LinkedHashSet<>();
		
		set.addAll(list);
		
		list.clear();
		list.addAll(set);

		
		return list;
		
	}
	
	public static void main(String[] args) {

		BasicConfigurator.configure();
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,10,1,2,2,3,3,10,3,4,5,5));
		
		logger.info("Array List with Duplicates: "+list);
		ArrayList<Integer> newList = removeDuplicates(list);
		Collections.sort(newList);
		logger.info("ArrayList with Douplicates Remove :"+newList);
	}

}
