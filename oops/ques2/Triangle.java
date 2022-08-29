package com.yash.oops.ques2;

import java.util.Scanner;

public class Triangle implements Shap{

	
	
	@Override
	public int area() {
		
		int sp,area, a = 7,b = 9,c = 6;
		
		sp=(a+b+c)/2;
		return area=(int) Math.sqrt((sp*(sp-a)*(sp-b)*(sp-c)));	
		
	}

	

}
