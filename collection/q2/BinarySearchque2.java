package com.yash.collection.q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BinarySearchque2 {

	static Logger logger = Logger.getLogger(BinarySearchque2.class.getName());

	int binarySearch(ArrayList<Integer> list, int x) {
		int left = 0, right = list.size() - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (list.get(mid) == x) {
				return mid;
			}
			if (list.get(mid) < x) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		BasicConfigurator.configure();

		// BinarySearchque2 bi = new BinarySearchque2();

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(10);
		list.add(2);
		list.add(35);
		list.add(25);
		list.add(40);
		list.add(60);
		list.add(26);
		list.add(31);

		int value = 10;

		logger.info(list);

		int result = Collections.binarySearch(list, value);
		if (result == -1) {
			logger.info("element is not there");
		}

		else {
			logger.info("the element " + value + " is found at" + " index " + result);
		}
	}

}
