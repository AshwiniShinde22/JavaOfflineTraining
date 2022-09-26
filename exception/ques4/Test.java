package com.yash.exception.ques4;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Test {

	static Logger logger = Logger.getLogger(Test.class.getName());
	public static void main(String[] args) {
		BasicConfigurator.configure();
		
		
		 ItemAddition itemAddition = new ItemAddition();



	       itemAddition.addItems();
	        try {
	            itemAddition.purchaseItems();
	        } catch (InputException e) {
	            
	            e.printStackTrace();
	        } catch (ItemPurchaseLimitExceed e) {
	            
	            e.printStackTrace();
	        }



	   }
		
		
		
		
		
		
		
		
		

//		Object arr[]= new Object[5];
//		Item i1 = new Item(101, "Mobile", 24000, 5);
//		Item i2 = new Item(102, "Laptop", 34000, 6);
//		Item i3 = new Item(103, "LED", 44000, 4);
//		Item i4 = new Item(104, "KeyBoard", 44000, 4);
//		Item i5 = new Item(105, "Mouse", 2000, 4);
//	
//		arr[0]=i1;
//		arr[1]=i2;
//		arr[2]=i3;
//		arr[3]=i4;
//		arr[4]=i5;
//		
//	    for(int i = 0;i<arr.length;i++)
//	    {
//	    	logger.info(arr[i]);
//	    }
//		Scanner sc = new Scanner(System.in);
//		Item it = new Item();
//		
//	    
//	}

}
