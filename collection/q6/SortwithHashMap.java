package com.yash.collection.q6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.yash.javatraining.assi2.MainShap;

public class SortwithHashMap {

	static HashMap<String, Integer> map = new HashMap<>();
	
	  public static void sortbykey()
	  {
		  TreeMap<String, Integer> sorted = new TreeMap<>();
		  sorted.putAll(map);
		  // Display the TreeMap which is naturally sorted
	        for (Map.Entry<String, Integer> entry : sorted.entrySet())
	            System.out.println("Key = " + entry.getKey() +
	                         ", Value = " + entry.getValue());       
	  }
	
	public static void main(String[] args) {

		
		
		map.put("pune", 250000);
		map.put("mumbai", 300000);
		map.put("nagpur", 200000);
		map.put("karnatak", 400000);
		map.put("Kerla", 4300000);
		
		 sortbykey();
		
	}

}
